package com.git.common.utils;

import com.alibaba.fastjson.JSON;
import com.git.common.annotation.RtmTableColumn;
import com.git.common.annotation.RtmTableName;
import com.git.common.eum.TypeEum;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
@Slf4j
public class RtmUtils extends org.apache.commons.lang3.StringUtils {


    public final static String KEY_LIST_COLUMN = "KEY_LIST_COLUMN";
    public final static String KEY_LIST_ATTRIBUTE = "KEY_LIST_ATTRIBUTE";
    private static Pattern linePattern = Pattern.compile("_(\\w)");
    private static Pattern humpPattern = Pattern.compile("[A-Z]");

    public static Class getClass(String clazzStr) {
        Class clazz = null;
        try {
            //利用forName读取配置文件的名称
            clazz = Class.forName(clazzStr);
        } catch (ClassNotFoundException e) {
            throw new RtmException("字符串转类错误", e);
        }
        return clazz;
    }

    /**
     * 获取注解中的表名
     * @param clazz
     * @return
     */
    public static String getTableName(Class clazz) {
        RtmTableName rtmTableName = (RtmTableName) clazz.getDeclaredAnnotation(RtmTableName.class);
        return (rtmTableName != null) ? rtmTableName.value().toUpperCase()
                : humpToLine(lowerFirstChar(clazz.getSimpleName())).toUpperCase();
    }

    /**
     * 获取需要排除的字段
     * @param clazz
     * @return
     */
    public static String[] getTableNameInsterExclude(Class clazz) {
        RtmTableName rtmTableName = (RtmTableName) clazz.getDeclaredAnnotation(RtmTableName.class);
        return (rtmTableName != null) ? rtmTableName.insertExclude() : new String[0];
    }

    /**
     * 获取需要修改的字段
     * @param clazz
     * @return
     */
    public static String[] getTableNameUpdateColumns(Class clazz) {
        RtmTableName rtmTableName = (RtmTableName) clazz.getDeclaredAnnotation(RtmTableName.class);
        return ArrayUtils.addAll(rtmTableName.updateColumns(), rtmTableName.updateKey());
    }


    /**
     * 创建修改sql
     * @param clazz
     * @return
     */
    public static String getTableNameUpdateSql(Class clazz) {
        RtmTableName rtmTableName = (RtmTableName) clazz.getDeclaredAnnotation(RtmTableName.class);
        StringBuffer buffer = new StringBuffer();
        buffer.append("UPDATE " + rtmTableName.value() + " SET ");
        for (int i = 0; i < rtmTableName.updateColumns().length; i++) {
            if (i == rtmTableName.updateColumns().length - 1) {
                buffer.append(rtmTableName.updateColumns()[i] + "=? WHERE ");
                for (int j = 0; j < rtmTableName.updateKey().length; j++) {
                    if (j == rtmTableName.updateKey().length - 1) {
                        buffer.append(rtmTableName.updateKey()[j] + "=?");
                    } else {
                        buffer.append(rtmTableName.updateKey()[j] + "=?,");
                    }
                }
            } else {
                buffer.append(rtmTableName.updateColumns()[i] + "=?, ");
            }
        }
        return buffer.toString();
    }


    /**
     * 返回实体对应数据库的列+返回所有注解属性
     *
     * @return
     */
    public static Map<String, List<String>> getTableColumn(TypeEum typeEum, Class clazz) {
        Map<String, List<String>> map = new HashMap<>();
        map.put(KEY_LIST_COLUMN, new ArrayList<>());
        map.put(KEY_LIST_ATTRIBUTE, new ArrayList<>());
        log.debug("读取当前类" + clazz.getSimpleName());
        map = columns(clazz, map);
        while (RtmUtils.isParentClass(clazz)) {
            clazz = clazz.getSuperclass();
            log.debug("读取继承类" + clazz.getSimpleName());
            map = columns(clazz, map);
        }
        //过滤掉不需要入库的属性
        List<String> listColumn = map.get(KEY_LIST_COLUMN);
        List<String> listAttribute = map.get(KEY_LIST_ATTRIBUTE);
        switch (typeEum) {
            case INSERT:
                String[] tableNameExclude = getTableNameInsterExclude(clazz);
                for (int i = 0; i < tableNameExclude.length; i++) {
                    int j = listColumn.indexOf(tableNameExclude[i].toUpperCase());
                    if (j > -1) {
                        listColumn.remove(j);
                        listAttribute.remove(j);
                    }
                }
                if (map.get(KEY_LIST_COLUMN).size() != map.get(KEY_LIST_ATTRIBUTE).size()) {
                    throw new RtmException("读取实体属性错误");
                }
                break;
            case UPDATE:
                String[] tableNameUpdateColumns = getTableNameUpdateColumns(clazz);
                tableNameUpdateColumns = JSON
                        .parseObject(JSON.toJSONString(tableNameUpdateColumns).toUpperCase(),
                                String[].class);
                String[] listAttribute_ = new String[tableNameUpdateColumns.length];
                for (int i = 0; i < listColumn.size(); i++) {
                    if (Arrays.asList(tableNameUpdateColumns).contains(listColumn.get(i))) {
                        int index = findIndex(tableNameUpdateColumns, listColumn.get(i));
                        if (index > -1) {
                            listAttribute_[index] = listAttribute.get(i);
                        } else {
                            throw new RtmException("未找到update注解中Column对应的Attribute");
                        }
                    }
                }
                listColumn.clear();
                listAttribute.clear();
                map.put(KEY_LIST_ATTRIBUTE, Arrays.asList(listAttribute_));
                if (map.get(KEY_LIST_ATTRIBUTE).size() < 1) {
                    throw new RtmException("读取实体属性错误");
                }
                break;
            default:
                break;
        }

        return map;
    }


    public static int findIndex(String[] arr1, String value) {
        int index = -1;
        if (null == arr1 || arr1.length == 0) {
            return index;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].equals(value)) {
                index = i;
                break;
            }
        }
        return index;
    }


    private static Map<String, List<String>> columns(Class clazz, Map<String, List<String>> map) {
        List<String> listColumn = map.get(KEY_LIST_COLUMN);
        List<String> listAttribute = map.get(KEY_LIST_ATTRIBUTE);
        for (Field declaredField : clazz.getDeclaredFields()) {
            char charArr[] = declaredField.getName().toCharArray();
            if (!Character.isUpperCase(charArr[0])) {
                RtmTableColumn fieldAnnotation = declaredField
                        .getDeclaredAnnotation(RtmTableColumn.class);
                if (fieldAnnotation != null) {
                    listColumn.add(fieldAnnotation.value().toUpperCase());
                } else {
                    listColumn.add(humpToLine(declaredField.getName()).toUpperCase());
                }
                listAttribute.add(declaredField.getName());

            }
        }
        map.put(KEY_LIST_COLUMN, listColumn);
        map.put(KEY_LIST_ATTRIBUTE, listAttribute);
        return map;
    }


    /**
     * 下划线转驼峰
     */
    public static String lineToHump(String str) {
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }


    /**
     * 驼峰转下划线
     */
    public static String humpToLine(String str) {
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /**
     * 根据属性名获取属性值
     */
    public static String getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            return value == null ? "\\N" : value.toString();
        } catch (Exception e) {
            throw new RtmException("根据属性名获取属性值错误", e);
        }
    }

    public static Map<String, Object> getFieldValueByNameAndType(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            if (value == null) {
                throw new RtmException("根据属性名获取属性值为空");
            }
            Map<String, Object> map = new HashMap<>();
            map.put(method.getGenericReturnType().getTypeName(), value);
            return map;
        } catch (Exception e) {
            throw new RtmException("根据属性名获取属性值错误", e);
        }
    }

    /**
     * 封装入库数据
     * @param jsonList
     * @param listAttribute
     * @param clazz
     * @return
     */
    public static InputStream getFieldListByStream(List<String> jsonList,
            List<String> listAttribute, Type clazz) {
        try {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < jsonList.size(); j++) {
                Object jsonObject = JSON.parse(jsonList.get(j));
                Object object = JSON.parseObject(jsonObject.toString(), clazz);
                for (int i = 0; i < listAttribute.size(); i++) {
                    if (listAttribute.get(i).toLowerCase().equals("id")) {
                        builder.append(uuid());
                        builder.append("\t");
                    } else {
                        String value = RtmUtils.getFieldValueByName(listAttribute.get(i), object);
                        builder.append(value);
                        if (i == listAttribute.size() - 1) {
                            builder.append("\n");
                        } else {
                            builder.append("\t");
                        }
                    }
                }
            }
            byte[] bytes = builder.toString().getBytes();
            InputStream dataStream = new ByteArrayInputStream(bytes);
            return dataStream;
        } catch (Exception e) {
            throw new RtmException("生成数据入库字节流失败", e);
        }
    }


    /**
     * 判断是否有父类
     */
    public static boolean isParentClass(Class clazz) {
        return !clazz.getSuperclass().getName().equals("java.lang.Object");
    }


    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    private static String lowerFirstChar(String str) {
        char[] chars = str.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }


}

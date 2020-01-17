package com.git.task.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.alibaba.fastjson.JSON;
import com.git.common.utils.RtmException;
import com.git.common.utils.RtmUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
@Slf4j
public abstract class RtmDao {

    public DruidDataSource dataSource;

    public int insert(String tableName, Type clazz, List<String> jsonList, List<String> listColumn,
            List<String> listAttribute) {
        String loadDataSql =
                "LOAD DATA LOCAL INFILE 'sql.csv' REPLACE  INTO TABLE " + tableName + " (" + (String
                        .join(",", listColumn)) + ")";
        PreparedStatement statement = null;
        com.mysql.jdbc.PreparedStatement mysqlStatement = null;
        DruidPooledConnection conn = null;
        InputStream dataStream = null;
        int result = 0;
        try {
            dataStream = RtmUtils.getFieldListByStream(jsonList, listAttribute, clazz);
            if (dataStream == null) {
                throw new RtmException("InputStream is null ,No data is imported");
            }
            conn = dataSource.getConnection();
            conn.setAutoCommit(false);
            statement = conn.prepareStatement(loadDataSql);
            if (statement.isWrapperFor(com.mysql.jdbc.Statement.class)) {
                mysqlStatement = statement.unwrap(com.mysql.jdbc.PreparedStatement.class);
                mysqlStatement.setLocalInfileInputStream(dataStream);
                result = mysqlStatement.executeUpdate();
                conn.commit();
            }
        } catch (SQLException sqle) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                throw new RtmException("rollback error=" + e1.getMessage());
            }
            throw new RtmException("execute error=" + sqle.getMessage());
        } finally {
            try {
                if (dataStream != null) {
                    dataStream.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                throw new RtmException("close Connection error", sqle);
            } catch (IOException ioe) {
                throw new RtmException("close IO error", ioe);
            }
        }
        return result;
    }


    public int update(String sql, Type clazz, List<String> jsonList, List<String> listAttribute) {
        DruidPooledConnection conn = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            conn = dataSource.getConnection();
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(sql);
            log.debug("updateSql=" + sql);
            for (int i = 0; i < jsonList.size(); i++) {
                Object jsonObject = JSON.parse(jsonList.get(i));
                Object object = JSON.parseObject(jsonObject.toString(), clazz);
                for (int j = 0; j < listAttribute.size(); j++) {
                    Map<String, Object> map = RtmUtils
                            .getFieldValueByNameAndType(listAttribute.get(j), object);
                    for (String key : map.keySet()) {
                        ps.setObject(j + 1, map.get(key));
                    }
                }
                ps.addBatch();
            }
            int rows[] = ps.executeBatch();
            conn.commit();
            result = rows.length;
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                throw new RtmException("rollback error", e1);
            }
            throw new RtmException("execute error", e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                throw new RtmException("close Connection error", sqle);
            }
        }
        return result;
    }
}

package com.git.common.eum;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
public enum TypeEum {

    /**
     * 批量插入 对应redis键值
     */
    INSERT("insert", "ACCT:DB:LIST:INSERT:", "ACCT:DB:LOCK:INSERT:", "批量插入"),

    /**
     * 批量修改 对应redis键值
     */
    UPDATE("update", "ACCT:DB:LIST:UPDATE:", "ACCT:DB:LOCK:UPDATE:", "批量修改");
    public String code;
    public String listKeyPrefix;
    public String lockKeyPrefix;
    public String desc;

    TypeEum(String code, String listKeyPrefix, String lockKeyPrefix, String desc) {
        this.code = code;
        this.listKeyPrefix = listKeyPrefix;
        this.lockKeyPrefix = lockKeyPrefix;
        this.desc = desc;
    }

    public static TypeEum getByCode(String code) {
        for (TypeEum typeEum : values()) {
            if (typeEum.getCode().equals(code)) {
                return typeEum;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getListKeyPrefix() {
        return listKeyPrefix;
    }

    public void setListKeyPrefix(String listKeyPrefix) {
        this.listKeyPrefix = listKeyPrefix;
    }

    public String getLockKeyPrefix() {
        return lockKeyPrefix;
    }

    public void setLockKeyPrefix(String lockKeyPrefix) {
        this.lockKeyPrefix = lockKeyPrefix;
    }
}

package com.git.common.redis;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
@Slf4j
@Component
public class RedisUtils {

    @Autowired
    RedisTemplate redisTemplate;


    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        redisTemplate.setKeySerializer(new DefaultStrSerializer());
        redisTemplate.setHashKeySerializer(new DefaultStrSerializer());
        redisTemplate.setValueSerializer(new DefaultStrSerializer());
        redisTemplate.setHashValueSerializer(new DefaultStrSerializer());
        return redisTemplate;
    }

    /**
     * 字符串类型:通过key值获取对应的value对象
     */
    public String get(final String key) {
        String result = (String) redisTemplate.opsForValue().get(key);
        log.debug("get({}),return={}", key, result);
        return result;
    }

    public String getSet(final String key, final String keyValue) {
        String result = (String) redisTemplate.opsForValue().getAndSet(key, keyValue);
        log.debug("getSet({},{}),return={}", key, keyValue, result);
        return result;
    }


    /**
     * 字符串类型:通过key删除对应的key和value
     */
    public Boolean delete(final String key) {
        Boolean result = redisTemplate.delete(key);
        log.debug("delete({}),return={}", key, result);
        return result;
    }


    /**
     * 字符串类型:根据key设置value值,如果key中的value存在,那么返回false
     */
    public Boolean setnx(final String key, final String value) {
        Boolean result = redisTemplate.opsForValue().setIfAbsent(key, value);
        log.debug("setnx({},{}),return={}", key, value, result);
        return result;
    }


    /***
     * 裁剪LIST
     */
    public void ltrim(final String key, final Long start, final Long end) {
        redisTemplate.opsForList().trim(key, start, end);
        log.debug("ltrim({},{},{}),return={}", key, start, end, "void");
    }


    /**
     * list列表类型:先进先出队列形式,单个值插入
     */
    public Long rpush(final String key, final String value) {
        Long result = redisTemplate.opsForList().rightPush(key, value);
        log.debug("rpush({},{}),return={}", key, value, result);
        return result;
    }

    /**
     * list列表类型: 返回存储在key的列表里指定范围内的元素。Start和end偏移量都是基于0的下标， 即list的第一个元素下标是0(list的开头)，第二个元素是下标1，以此类推。
     * 偏移量也可以是负数，表示偏移量是从list尾部开始计数。例如，-1表示列表的最后一个元素，-2是倒数第二个，以此类推。
     */
    public List<String> lrange(final String key, final Long start, final Long end) {
        List<String> result = redisTemplate.opsForList().range(key, start, end);
        log.debug("lrange({},{},{}),return={}", key, start, end, result);
        return result;
    }


    /**
     * list列表类型:返回list中的元素个数
     */
    public Long llen(final String key) {
        Long result = redisTemplate.opsForList().size(key);
        log.debug("llen({}),return={}", key, result);
        return result;
    }


    /**
     * 获取库的字符串序列化对象
     */
    protected RedisSerializer<String> getRedisSerializer() {
        RedisSerializer<String> redisSerializer = redisTemplate.getStringSerializer();
        return redisSerializer;
    }


    /**
     * 获取锁
     */

    public boolean acquireLock(String lock, long lockTime) {
        // 1. 通过SETNX试图获取一个lock
        boolean success = false;
        long value = System.currentTimeMillis() + lockTime;
        //SETNX成功，则成功获取一个锁
        if (setnx(lock, String.valueOf(value))) {
            success = true;
        }//SETNX失败，说明锁仍然被其他对象保持，检查其是否已经超时
        else {
            String oldValue_key = get(lock);
            if (StringUtils.isNotBlank(oldValue_key)) {
                long oldValue = Long.valueOf(oldValue_key);
                //超时
                if (oldValue < System.currentTimeMillis()) {
                    String getValue = getSet(lock, String.valueOf(value));
                    // 获取锁成功
                    if (Long.valueOf(getValue) == oldValue) {
                        success = true;
                    }// 已被其他进程捷足先登了
                    else {
                        success = false;
                    }
                }
                //未超时，则直接返回失败
                else {
                    success = false;
                }
            }

        }
        return success;
    }

    // 释放锁
    public void releaseLock(String lock) {
        long current = System.currentTimeMillis();
        // 避免删除非自己获取得到的锁
        String lockTime = get(lock);
        if (StringUtils.isNotBlank(lockTime)) {
            if (current < Long.valueOf(lockTime)) {
                delete(lock);
            }
        }
    }


}
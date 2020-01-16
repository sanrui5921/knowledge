package org.sunrain.study.redis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.DefaultTypedTuple;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import static org.springframework.http.HttpStatus.OK;

//https://www.cnblogs.com/EasonJim/p/7803067.html
@RestController
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/redis/test")
    @ResponseStatus(OK)
    public void test() throws Exception {
        redisTemplate.opsForValue().set("name", "tom");
        System.out.println(redisTemplate.opsForValue().get("name"));
        System.out.println("--------------------------------------");

//        redisTemplate.opsForValue().set("name", "tom", 10, TimeUnit.SECONDS);
//        Thread.sleep(11 * 1000);
//        System.out.println(redisTemplate.opsForValue().get("name"));//由于设置的是10秒失效，十秒之内查询有结果，十秒之后返回为null
//        System.out.println("--------------------------------------");

        redisTemplate.opsForValue().set("key", "hello world");
        redisTemplate.opsForValue().set("key", "redis", 6);
        System.out.println(redisTemplate.opsForValue().get("key"));
        System.out.println("--------------------------------------");
        System.out.println(redisTemplate.opsForValue().setIfAbsent("multi1", "multi1"));//false  multi1之前已经存在
        System.out.println(redisTemplate.opsForValue().setIfAbsent("multi111", "multi111"));//true  multi111之前不存在
        System.out.println("--------------------------------------");

        Map<String, String> maps = new HashMap<String, String>();
        maps.put("multi1", "multi1");
        maps.put("multi2", "multi2");
        maps.put("multi3", "multi3");
        redisTemplate.opsForValue().multiSet(maps);
        List<String> keys = new ArrayList<String>();
        keys.add("multi1");
        keys.add("multi2");
        keys.add("multi3");
        System.out.println(redisTemplate.opsForValue().multiGet(keys));
        System.out.println("--------------------------------------");
        Map<String, String> maps1 = new HashMap<String, String>();
        maps1.put("multi11", "multi11");
        maps1.put("multi22", "multi22");
        maps1.put("multi33", "multi33");
        Map<String, String> maps2 = new HashMap<String, String>();
        maps2.put("multi1", "multi1");
        maps2.put("multi2", "multi2");
        maps2.put("multi3", "multi3");
        System.out.println(redisTemplate.opsForValue().multiSetIfAbsent(maps1));
        System.out.println(redisTemplate.opsForValue().multiSetIfAbsent(maps2));
        System.out.println("--------------------------------------");
    }

    @RequestMapping(value = "/redis/zset")
    @ResponseStatus(OK)
    public void zset() throws Exception {
        zsetTest1();
        zsetTest2();
        zsetTest3();
        zsetTest4();
    }

    private void zsetTest1() {
        System.out.println(redisTemplate.opsForZSet().add("zset-key1", "zset-value-1", 1.0));
        System.out.println(redisTemplate.opsForZSet().add("zset-key1", "zset-value-2", 2.0));
        System.out.println(redisTemplate.opsForZSet().zCard("zset-key1"));
    }

    private void zsetTest2() {
        ZSetOperations.TypedTuple<Object> objectTypedTuple1 = new DefaultTypedTuple<Object>("zset-value-5", 9.6);
        ZSetOperations.TypedTuple<Object> objectTypedTuple2 = new DefaultTypedTuple<Object>("zset-value-6", 9.9);
        Set<ZSetOperations.TypedTuple<Object>> tuples = new HashSet<ZSetOperations.TypedTuple<Object>>();
        tuples.add(objectTypedTuple1);
        tuples.add(objectTypedTuple2);
        System.out.println(redisTemplate.opsForZSet().add("zset-key1", tuples));
        System.out.println(redisTemplate.opsForZSet().range("zset-key1", 0, -1));
    }

    private void zsetTest3() {
        System.out.println(redisTemplate.opsForZSet().range("zset-key1", 0, -1));
        System.out.println(redisTemplate.opsForZSet().remove("zset-key1", "zset-value-5"));
        System.out.println(redisTemplate.opsForZSet().range("zset-key1", 0, -1));
        System.out.println(redisTemplate.opsForZSet().incrementScore("zset-key1", "zset-value-1", 1.1));
        System.out.println(redisTemplate.opsForZSet().range("zset-key1", 0, -1));
    }

    private void zsetTest4() {
        System.out.println(redisTemplate.opsForZSet().range("zset-key1", 0, -1));
        System.out.println(redisTemplate.opsForZSet().rank("zset-key1", "zset-value-1"));
        System.out.println(redisTemplate.opsForZSet().rank("zset-key1", "zset-value-2"));
        System.out.println(redisTemplate.opsForZSet().rank("zset-key1", "zset-value-6"));
    }
}
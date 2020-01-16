package org.sunrain.study.springboot.demo;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Spring Boot 线程池异步任务单元测试
 */
@Slf4j
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ThreadTestCase {

    // 注入我们声明的任务方法对象
    @Autowired
    private SimpleTask simpleTask;

    @org.junit.Test
    public void testRunTaskOne() {
        log.info("===== run_task_one =====");
        log.info("开始请求任务1");
        Stopwatch sw = Stopwatch.createStarted();

        simpleTask.doTaskOne("12345");

        log.info("完成请求任务1, 耗时：{}", sw.stop());
    }

    @Test
    public void testRunTaskTwo() throws ExecutionException, InterruptedException {
        log.info("===== run_task_two =====");

        log.info("开始请求任务2");
        Stopwatch sw = Stopwatch.createStarted();

        Future<String> feature = simpleTask.doTaskTwo("12345");
        while (true) {
            if (feature.isDone()) {
                log.info("完成请求任务2，返回结果：{}， 耗时：{}", feature.get(), sw.stop());
                break;
            }
            log.info("任务2未范完成，等待中.....");
        }
    }

    @Test
    public void testRunTaskTwoPlus() throws ExecutionException, InterruptedException, TimeoutException {
        log.info("===== run_task_two_plus ====");

        log.info("开始请求任务2");
        Stopwatch sw = Stopwatch.createStarted();

        Future<String> feature = simpleTask.doTaskTwo("12345");

        String result = feature.get(10, TimeUnit.SECONDS);
        log.info("完成请求任务2，返回结果：{}， 耗时：{}", result, sw.stop());
    }
}
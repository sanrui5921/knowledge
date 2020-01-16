package org.sunrain.study.springboot.demo;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * SimpleTask
 */
@Slf4j
@Component
public class SimpleTask {

    /**
     * 普通任务，无返回结果
     *
     * @param data
     */
    @Async("taskExecutor")
    public void doTaskOne(String data) {
        try {
            log.info("开始做任务1");
            Stopwatch sw = Stopwatch.createStarted();
            Thread.sleep(5000);
            log.info("完成任务1， 耗时：{}", sw.stop());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 有返回结果，通过 AsyncResult 异步获取
     *
     * @param data
     * @return
     */
    @Async("taskExecutor")
    public Future<String> doTaskTwo(String data) {
        try {
            log.info("开始做任务2");
            Stopwatch sw = Stopwatch.createStarted();

            Thread.sleep(5000);

            log.info("完成任务2， 耗时：{}", sw.stop());

            return new AsyncResult<>(data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
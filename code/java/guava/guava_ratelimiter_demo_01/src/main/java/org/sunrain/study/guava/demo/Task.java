package org.sunrain.study.guava.demo;

import com.google.common.util.concurrent.RateLimiter;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.concurrent.CountDownLatch;


@AllArgsConstructor
public class Task extends Thread {

    RateLimiter rateLimiter;

    CountDownLatch countDownLatch;

    @Override
    public void run() {
        rateLimiter.acquire(1);
        System.out.println(new Date() + " " + Thread.currentThread().getName() + " start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date() + " " + Thread.currentThread().getName() + " gets job done");

        countDownLatch.countDown();
    }
}

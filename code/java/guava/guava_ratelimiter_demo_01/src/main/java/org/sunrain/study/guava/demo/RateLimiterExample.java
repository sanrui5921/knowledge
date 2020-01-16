package org.sunrain.study.guava.demo;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.CountDownLatch;

public class RateLimiterExample {

    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter = RateLimiter.create(1);
        int nTasks = 10;
        CountDownLatch countDownLatch = new CountDownLatch(nTasks);
        long start = System.currentTimeMillis();
        for (int i = 0; i < nTasks; i++) {
            new Task(rateLimiter, countDownLatch).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("10 jobs gets done by 5 threads concurrently in " + (end - start) + " milliseconds");
    }
}


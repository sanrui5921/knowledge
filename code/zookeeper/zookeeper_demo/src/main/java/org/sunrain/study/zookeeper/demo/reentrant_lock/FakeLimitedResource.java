package org.sunrain.study.zookeeper.demo.reentrant_lock;

import java.util.concurrent.atomic.AtomicBoolean;

public class FakeLimitedResource {

    private final AtomicBoolean inUse = new AtomicBoolean(false);

    // 模拟只能单线程操作的资源
    public void use() throws InterruptedException {
        if (!inUse.compareAndSet(false, true)) {
            // 在正确使用锁的情况下，此异常不可能抛出
            throw new IllegalStateException("Needs to be used by one client at a time");
        }
        try {
            Thread.sleep((long) (3 * Math.random()));
        } finally {
            inUse.set(false);
        }
    }
}
package org.sunrain.study.zookeeper.demo.reentrant_lock;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;

import java.util.concurrent.TimeUnit;

public class ExampleClientThatLocks {
    private final InterProcessMutex lock;

    private final FakeLimitedResource resource;

    private final String clientName;

    public ExampleClientThatLocks(CuratorFramework client, String lockPath, FakeLimitedResource resource, String clientName) {
        this.resource = resource;
        this.clientName = clientName;
        lock = new InterProcessMutex(client, lockPath);
    }

    public void doWork(long time, TimeUnit unit) throws Exception {
        if (!lock.acquire(time, unit)) {
            throw new IllegalStateException(clientName + " 不能得到互斥锁");
        }
        try {
            System.out.println(clientName + " 已获取到互斥锁");
            resource.use(); // 使用资源
            Thread.sleep(1000 * 1);
        } finally {
            System.out.println(clientName + " 释放互斥锁");
            lock.release(); // 总是在finally中释放
        }
    }
}
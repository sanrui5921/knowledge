package org.sunrain.study.zookeeper.demo.reentrant_lock.my;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.utils.CloseableUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyReentrantLockExample {

    private static final int QTY = 5;

    private static final int REPETITIONS = QTY * 10;

    private static final String PATH = "/examples/my_locks";

    public static void main(String[] args) {
        final List<CuratorFramework> clientList = new ArrayList<CuratorFramework>();
        for (int i = 0; i < QTY; i++) {
            CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:3181", new ExponentialBackoffRetry(1000, 3));
            client.start();
            clientList.add(client);
        }

        ExecutorService service = Executors.newFixedThreadPool(QTY);
        for (int i = 0; i < QTY; ++i) {
            final int index = i;
            Callable<Void> task = new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    try {
                        Task task1 = new Task(clientList.get(index), PATH, "Client#" + index);
                        for (int j = 0; j < REPETITIONS; ++j) {
                            task1.doWork(10, TimeUnit.SECONDS);
                        }
                    } catch (Throwable e) {
                        e.printStackTrace();
                    } finally {
                        CloseableUtils.closeQuietly(clientList.get(index));
                    }
                    return null;
                }
            };
            service.submit(task);
        }
    }

    static class Task {

        private InterProcessMutex lock;

        private String clientName;

        public Task(CuratorFramework client, String lockPath, String clientName) {
            this.clientName = clientName;
            lock = new InterProcessMutex(client, lockPath);
        }

        public void doWork(long time, TimeUnit unit) throws Exception {
            if (!lock.acquire(time, unit)) {
                throw new IllegalStateException(clientName + " 不能得到互斥锁");
            }
            try {
                System.out.println(clientName + " 已获取到互斥锁");
                System.out.println("Working................................");
                Thread.sleep(1000 * 1);
            } finally {
                System.out.println(clientName + " 释放互斥锁");
                lock.release(); // 总是在finally中释放
            }
        }
    }
}

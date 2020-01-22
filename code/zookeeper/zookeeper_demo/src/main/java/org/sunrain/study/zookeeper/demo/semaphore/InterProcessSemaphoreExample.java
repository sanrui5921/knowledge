package org.sunrain.study.zookeeper.demo.semaphore;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessSemaphoreV2;
import org.apache.curator.framework.recipes.locks.Lease;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.sunrain.study.zookeeper.demo.reentrant_lock.FakeLimitedResource;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class InterProcessSemaphoreExample {

    private static final int MAX_LEASE = 10;

    private static final String PATH = "/examples/locks";

    public static void main(String[] args) throws Exception {
        FakeLimitedResource resource = new FakeLimitedResource();
        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", new ExponentialBackoffRetry(1000, 3));
        client.start();
        InterProcessSemaphoreV2 semaphore = new InterProcessSemaphoreV2(client, PATH, MAX_LEASE);
        Collection<Lease> leases = semaphore.acquire(5);
        System.out.println("获取租约数量：" + leases.size());
        Lease lease = semaphore.acquire();
        System.out.println("获取单个租约");
        resource.use();
        Collection<Lease> leases2 = semaphore.acquire(5, 10, TimeUnit.SECONDS);
        System.out.println("获取租约，如果为空则超时： " + leases2);
        System.out.println("释放租约");
        semaphore.returnLease(lease);
        System.out.println("释放集合中的所有租约");
        semaphore.returnAll(leases);
        client.close();
        System.out.println("OK!");
    }
}

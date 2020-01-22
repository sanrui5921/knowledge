package org.sunrain.study.zookeeper.demo.leader_election;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.leader.LeaderSelector;
import org.apache.curator.framework.recipes.leader.LeaderSelectorListenerAdapter;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleClient extends LeaderSelectorListenerAdapter implements Closeable {

    private final String name;

    private final LeaderSelector leaderSelector;

    private final AtomicInteger leaderCount = new AtomicInteger();

    public ExampleClient(CuratorFramework client, String path, String name) {
        this.name = name;
        leaderSelector = new LeaderSelector(client, path, this);
        leaderSelector.autoRequeue();
    }

    public void start() throws IOException {
        leaderSelector.start();
    }

    @Override
    public void close() throws IOException {
        leaderSelector.close();
    }

    @Override
    public void takeLeadership(CuratorFramework client) throws Exception {
        final int waitSeconds = 1;
        System.out.println(name + " 是当前的leader(" + leaderSelector.hasLeadership() + ") 等待" + waitSeconds + "秒...");
        System.out.println(name + " 之前成为leader的次数：" + leaderCount.getAndIncrement() + "次");
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(waitSeconds));
        } catch (InterruptedException e) {
            System.err.println(name + " 已被中断");
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(name + " 放弃leader\n");
        }
    }
}
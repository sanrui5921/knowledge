package org.sunrain.study.springboot.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ThreadPoolTaskExecutor 自定义扩展
 */
@Slf4j
public class MyThreadPoolTaskExecutor extends ThreadPoolTaskExecutor {

    /**
     * 采集线程池运行时信息
     * TODO 这里是出于演示目的对执行过程进行信息采集，生产环境建议对 Task 类型和执行过程步骤进行枚举化管理
     *
     * @param message 执行过程消息
     */
    private void collectInfo(String message) {
        ThreadPoolExecutor tpe = getThreadPoolExecutor();

        if (null == tpe) {
            return;
        }

        //=============== 采集运行时信息 ===============//
        // 有过任务的大致总数
        Long taskCount = tpe.getTaskCount();
        // 已完成的任务总数
        Long completedTeskCount = tpe.getCompletedTaskCount();
        // 当前正在执行的线程数
        Integer activeCount = tpe.getActiveCount();
        // 当前队列的长度
        Integer queueSize = tpe.getQueue().size();

        // TODO 在这里将采集到的信息输出到日志或者通过其他方式进行采集分析
        log.info("……");
        System.out.println("……");
    }

    @Override
    public void execute(Runnable task) {
        collectInfo("开始执行:" + task.getClass().getSimpleName());
        super.execute(task);
    }

    @Override
    public void execute(Runnable task, long startTimeout) {
        collectInfo("开始执行:" + task.getClass().getSimpleName() + "超时时间：" + startTimeout);
        super.execute(task, startTimeout);
    }

    @Override
    public Future<?> submit(Runnable task) {
        collectInfo("开始提交：" + task.getClass().getSimpleName());
        return super.submit(task);
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        collectInfo("开始提交多任务：" + task.getClass().getSimpleName());
        return super.submit(task);
    }

    @Override
    public ListenableFuture<?> submitListenable(Runnable task) {
        collectInfo("开始提交监听任务：" + task.getClass().getSimpleName());
        return super.submitListenable(task);
    }

    @Override
    public <T> ListenableFuture<T> submitListenable(Callable<T> task) {
        collectInfo("开始提交监听多任务：" + task.getClass().getSimpleName());
        return super.submitListenable(task);
    }

    @Override
    protected void cancelRemainingTask(Runnable task) {
        log.info("执行取消剩余的任务.");
        super.cancelRemainingTask(task);
    }

    // 这里还可以 Override 一些线程池生命周期的方法，进行信息采集，如：init,shutdown,destroy
}
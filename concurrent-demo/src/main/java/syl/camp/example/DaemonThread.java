package syl.camp.example;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sunyl
 * @date 2021/8/22 9:18 下午
 * @see syl.camp.example
 */
@Slf4j
public class DaemonThread {

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread thread = Thread.currentThread();
            log.info("Current Thread:{}", thread.getName());
        };

        Thread thread = new Thread(task);
        thread.setName("test-thread-1");

        // 主线程终止前，若其它线程均为守护线程，则直接终止所有线程
        // thread.setDaemon(true);
        thread.start();
        log.info("🍑Current Thread:{}", thread.getName());

        ReentrantLock lock = new ReentrantLock();
        synchronized (lock) {

        }
    }

}

package syl.camp.homework;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 判断 synchronized 是否是可重入锁？
 *
 * @author sunyl
 * @date 2021/8/25 6:00 下午
 * @see syl.camp.homework
 */
@Slf4j
public class Bar {

    private Integer counter = 0;

    public void justCount() {

        synchronized (this) {
            log.info("I'm going to counting...");
            try {
                Thread.sleep(5000);
                counter++;
                log.info("Current count value is {}", counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void justCountPro() {

        Lock lock = new ReentrantLock(true);
        try {
            boolean tryLock = lock.tryLock();
            Thread.sleep(5000);
            if (tryLock) {
                log.info("Get Lock ✌️");
                counter++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Bar bar = new Bar();
        log.info("Current Thread name is {}", Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            bar.justCountPro();
        }

        log.info("Final result:{}", bar.counter);
    }
}

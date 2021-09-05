package syl.camp.example.tool;

import java.util.concurrent.CountDownLatch;

/**
 * @author sunyl
 * @date 2021/8/28 1:39 下午
 * @see syl.camp.example.tool
 */
public class CountDownLatchDemo implements Runnable {

    private CountDownLatch latch;

    public CountDownLatchDemo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

    }
}

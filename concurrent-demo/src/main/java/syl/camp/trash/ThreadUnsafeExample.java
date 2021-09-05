package syl.camp.trash;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sunyl
 * @date 2021/8/26 2:02 下午
 * @see syl.camp.trash
 */
public class ThreadUnsafeExample {

    private AtomicInteger count = new AtomicInteger(0);

    public void addAndGet() {
        count.addAndGet(1);
    }

    public static void main(String[] args) {
        ThreadUnsafeExample unsafeExample = new ThreadUnsafeExample();

        final int threadSize = 1000;
        final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        ExecutorService service = Executors.newCachedThreadPool();

    }
}

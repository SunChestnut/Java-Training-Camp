package syl.camp.example.tool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;

/**
 * @author sunyl
 * @date 2021/8/28 1:11 下午
 * @see syl.camp.example.tool
 */
@Slf4j
public class SemaphoreDemo {

    public static void main(String[] args) {

        // 工人数
        int N = 8;
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < N; i++) {
            new Worker(i, semaphore).start();
        }
    }

    static class Worker extends Thread {
        private int num;
        private Semaphore semaphore;

        public Worker(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                // 在子线程里控制资源占用
                semaphore.acquire();

                log.info("工人" + this.num + "占用一个机器在生产...");
                Thread.sleep(2000);
                log.info("工人" + this.num + "释放出机器");

                // 在子线程中控制释放资源占用
                semaphore.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

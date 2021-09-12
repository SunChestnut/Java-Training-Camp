package syl.camp.practice;

import lombok.extern.slf4j.Slf4j;

/**
 * 【👋 线程之间的协作】系列 —— `join`方法
 * <p>
 * 在当前线程中调用另外一个线程的 join 方法，会将当前线程挂起，直到目标线程结束
 *
 * @author sunyl
 * @date 2021/8/25 7:54 下午
 * @see syl.camp.practice
 */
@Slf4j
public class JoinExample {

    static class Foo extends Thread {

        @Override
        public void run() {
            log.info("【Foo】Thread " + this.getName() + " is running...");
            try {
                Thread.sleep(5000);
                log.info("Wake Up...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Bar extends Thread {

        private Foo foo;

        Bar(Foo foo) {
            this.foo = foo;
        }

        @Override
        public void run() {
            try {
                log.info("【Bar】Thread " + this.getName() + " is running...");
                foo.join();
                log.info("Hahahaha, I'm back 💪");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        Bar bar = new Bar(foo);

        // 虽然 bar 线程先启动，但是因为在 bar 线程中调用了 foo 线程的 join 方法，
        // bar 线程会等 foo 线程执行完毕后再继续执行，最后能保证 foo 线程的输出先于 bar 线程
        bar.start();
        foo.start();

    }

}

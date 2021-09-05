package syl.camp.springdemo.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Spring 中默认实现 AOP 的方式有两种：
 * 一种是用 代码 + XML配置 的方式
 * 另外一种是用 全注解 的方式
 */
public class Aop1 {

    //前置通知
    public void startTransaction() {
        // 执行顺序 -> 2
        System.out.println("    ====>begin ding... 【执行顺序 -> 2】");
    }

    //后置通知
    public void commitTransaction() {
        // 执行顺序 -> 4
        System.out.println("    ====>finish ding... 【执行顺序 -> 4】");
    }

    //环绕通知
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 执行顺序 -> 1
        System.out.println("    ====>around begin ding...【执行顺序 -> 1】");
        //调用process()方法才会真正的执行实际被代理的方法
        joinPoint.proceed();

        // 执行顺序 -> 3
        System.out.println("    ====>around finish ding... 【执行顺序 -> 3】");
    }

}
package syl.camp.java8.java8demo.example.guava;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sunyl
 * @date 2021/9/9 2:38 下午
 * @see syl.camp.java8.java8demo.example.guava
 */
@Slf4j
public class DynamicInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("Invoked method:{}", method.getName());
        return 666;
    }
}

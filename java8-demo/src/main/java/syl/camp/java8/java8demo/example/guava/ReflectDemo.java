package syl.camp.java8.java8demo.example.guava;

import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @author sunyl
 * @date 2021/9/9 2:32 下午
 * @see syl.camp.java8.java8demo.example.guava
 */
public class ReflectDemo {

    public static void pureJavaReflection() {
        Map proxyInstance = (Map) Proxy.newProxyInstance(ReflectDemo.class.getClassLoader(), new Class[]{Map.class}, new DynamicInvocationHandler());
    }


    public static void main(String[] args) {
    }

}

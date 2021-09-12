package syl.camp.java8.java8demo.example.guava;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author sunyl
 * @date 2021/9/9 4:19 下午
 * @see syl.camp.java8.java8demo.example.guava
 */
public class OperateListDemo {

    public static void main(String[] args) {

        List<Integer> list = Lists.newArrayList(4, 2, 3, 5, 1, 2, 2, 7, 6);

        // `partition`方法在做类似于负载均衡，对一大堆数据进行分组操作时使用
        List<List<Integer>> partition = Lists.partition(list, 3);
        System.out.println("集合的切片操作，将集合切分3个一片，相当于把一维的 List 拆成二维的数组: " + partition);
    }
}

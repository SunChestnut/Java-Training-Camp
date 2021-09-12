package syl.camp.java8.java8demo.example.guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author sunyl
 * @date 2021/9/9 4:28 下午
 * @see syl.camp.java8.java8demo.example.guava
 */
public class OperateMultimapDemo {

    public static void createMultimap(List<String> list) {
        // 将重复 key 的所有值封装到一个集合里
        ArrayListMultimap<Object, Object> multimap = ArrayListMultimap.create();
        list.forEach(i -> multimap.put(i, i + 1));
        System.out.println(multimap);
    }

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("a", "demand", "b", "555", "a", "b", "c");

        // output: {a=[a1, a1], b=[b1, b1], c=[c1], demand=[demand1], 555=[5551]}
        createMultimap(list);
    }
}

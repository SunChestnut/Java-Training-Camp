package syl.camp.java8.java8demo.example.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


/**
 * @author sunyl
 * @date 2021/9/9 10:19 上午
 * @see syl.camp.java8.java8demo.example.stream
 */
public class StreamDemo {

    public static void operateInteger() {
        List<Integer> list = Arrays.asList(4, 2, 3, 5, 1, 2, 2, 7, 6);
        System.out.println("初始集合的值 : " + list);

        Optional<Integer> first = list.stream().findFirst();
        System.out.println("获取集合中第一个元素的值，如果没有，则返回 null : " + (first.orElse(null)));

        System.out.println("将集合中的第一个元素✖️100，如果第一个元素之为空，则返回 100：" + first.map(i -> i * 100).orElse(100));

        System.out.println(list.stream().filter(i -> i < 4).collect(Collectors.toList()));

        Integer sum = list.stream().filter(i -> i < 4).distinct().reduce(0, (a, b) -> a + b);
        System.out.println("过滤出集合中小于 4 的元素，去重，并计算加法的规约值：" + sum);

        Integer multi = list.stream().filter(i -> i < 4).distinct().reduce(1, (a, b) -> a * b);
        System.out.println("过滤出集合中小于 4 的元素，去重，并计算乘法的规约值：" + multi);

        LinkedHashMap<Integer, Integer> listToMap = list.stream().parallel().collect(Collectors.toMap(a -> a, a -> (a + 1), (a, b) -> a, LinkedHashMap::new));
        System.out.println("将集合转换成 map : " + listToMap);
    }

    public static void main(String[] args) {
        operateInteger();
    }

}

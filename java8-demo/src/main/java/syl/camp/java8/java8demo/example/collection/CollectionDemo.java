package syl.camp.java8.java8demo.example.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sunyl
 * @date 2021/9/7 10:08 下午
 * @see syl.camp.java8.java8demo.example.collection
 */
public class CollectionDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 2, 3, 5, 1, 2, 2, 7, 6);
        System.out.println();

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        // 打乱集合内元素顺序
        Collections.shuffle(list);
        System.out.println(list);

        // 查徇集合内元素 2 出现的频率
        System.out.println(Collections.frequency(list, 2));

        System.out.println(Collections.max(list));

        Collections.fill(list, 8);
        System.out.println(list);

        list = Collections.singletonList(6);
        System.out.println(list);


    }

}

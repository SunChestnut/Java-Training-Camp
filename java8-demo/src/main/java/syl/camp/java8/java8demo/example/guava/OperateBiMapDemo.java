package syl.camp.java8.java8demo.example.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * @author sunyl
 * @date 2021/9/9 4:51 下午
 * @see syl.camp.java8.java8demo.example.guava
 */
public class OperateBiMapDemo {

    public static void createBimap() {
        HashBiMap<String, Integer> words = HashBiMap.create();
        words.put("First", 1);
        words.put("Second", 2);
        words.put("Third", 3);

        System.out.println("根据 Value 获取 Key 的值：" + words.get("Second"));

        BiMap<Integer, String> inverse = words.inverse();
        // 如果 Bimap 中存在相同值的 value，则反转操作会报参数异常的错:java.lang.IllegalArgumentException
        System.out.println("反转 Map，反转后 key 和 value 的位置互换 :" + inverse);
        System.out.println("获取 key=2 对应的 value 值：" + inverse.get(2));
    }

    public static void main(String[] args) {
        createBimap();
    }

}

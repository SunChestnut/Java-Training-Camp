package syl.camp.java8.java8demo.example.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyl
 * @date 2021/9/9 2:10 下午
 * @see syl.camp.java8.java8demo.example.guava
 */
public class OperateStringDemo {

    public static void main(String[] args) {
        ArrayList<String> list = Lists.newArrayList("a", "b", "g", "8", "9");
        System.out.println("创建一个「可变」的集合实例 : " + list);

        String join = Joiner.on(",").join(list);
        System.out.println("将集合以 \",\" 分隔，拼接成字符串：" + join);

        String withBlankChar = "34344,,,           34,34,哈哈 ";
        List<String> removeBlank = Splitter.on(",")
                .trimResults()          // 去除每一个字串中前岛和尾随的空格
                .omitEmptyStrings()     // 自动省略结果中的空字符串
                .splitToList(withBlankChar);
        System.out.println("去除字符串中的空白字符，并将字符串转成集合：" + removeBlank);

    }
}

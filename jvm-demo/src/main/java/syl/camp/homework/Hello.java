package syl.camp.homework;

/**
 * 【第一周】【作业1】
 * 自己写一个简单的 Hello.java，里面需要涉及基本类型，四则运行，if 和 for，然后自己分析一下对应的字节码。
 * ⚠️ 字节码分析部分暂时缺席
 *
 * @author sunyl
 * @date 2021/8/8 8:48 下午
 * @see syl.camp.homework
 */
public class Hello {

    public void bar() {
        int num = 25;
        double money = 233.45;
        long pageSize = 188;
        byte bytecode = 5;

        System.out.println(num + pageSize);
        System.out.println(money * bytecode);
        System.out.println(pageSize / bytecode);
        System.out.println(num - money);

        for (int i = 0; i < num / 5; i++) {
            money = money - i;
        }

        if (money < 0) {
            System.out.println("没关系，我的思想是富有的😭");
        }
    }

}

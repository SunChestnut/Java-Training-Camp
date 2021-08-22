package syl.camp.homework;

import cn.hutool.core.io.FileUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.lang.reflect.Method;

/**
 * 【第一周】【作业1】
 * 自定义一个 Classloader，加载一个 Hello.xlass 文件，执行 hello 方法，
 * 此文件内容是一个 Hello.class 文件所有字节（x=255-x）处理后的文件。
 * （文件存放于当前项目的 resources/allfile 目录下）
 *
 * @author sunyl
 * @date 2021/8/8 6:46 下午
 * @see syl.camp.homework
 */
@Slf4j
public class CustomerClassLoader extends ClassLoader {

    public byte[] decodeXlassFile() {

        String commonPath = System.getProperty("user.dir") + File.separator + "jvm-demo/src/main/resources" + File.separator + "allfile" + File.separator;

        File file = new File(commonPath + "Hello.xlass");

        byte[] bytes = FileUtil.readBytes(file);
        byte[] result = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            byte classValue = (byte) (255 - bytes[i]);
            result[i] = classValue;
        }

        File classFile = new File(commonPath + "Hello.class");
        FileUtil.writeBytes(result, classFile);

        return result;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = decodeXlassFile();
        return defineClass(name, bytes, 0, bytes.length);
    }


    public static void main(String[] args) {
        try {
            CustomerClassLoader decodeFile = new CustomerClassLoader();
            Class<?> hello = decodeFile.findClass("Hello");

            Method helloMethod = hello.getMethod("hello");
            helloMethod.invoke(hello.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Something Wrong! Please Help ME:{}", e.getMessage());
        }

    }

}

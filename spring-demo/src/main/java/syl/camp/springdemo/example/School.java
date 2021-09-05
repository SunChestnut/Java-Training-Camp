package syl.camp.springdemo.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

@Data
public class School implements ISchool {

    /**
     * `@Autowired` 默认按类型注入
     * 参数 required 表示是否在项目启动时注入还是在调用该类的属性或方法时注入（第二种为懒加载）
     * <p>
     * 🌰：当采用构造器方式注入，且构造参数有多个时，参数 required 的意义不变么❓
     */
    @Autowired(required = true)
    Klass class1;

    /**
     * `@Resource` 默认按照名称注入
     */
    @Resource(name = "student100")
    Student student100;

    @Override
    public void ding() {

        System.out.println("Class1 have " + this.class1.getStudents().size() + " students and one is " + this.student100);

    }

}

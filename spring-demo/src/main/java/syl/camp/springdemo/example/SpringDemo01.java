package syl.camp.springdemo.example;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class SpringDemo01 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 参数为 Class 时，全局只能有一个 bean
//        Student student123 = context.getBean(Student.class);

        String[] beanNamesForType = context.getBeanNamesForType(Student.class);
        log.info("beanNamesForType:{}", beanNamesForType);

        Student student123 = (Student) context.getBean("student123");
        student123.print();

        Student student100 = (Student) context.getBean("student100");
        student100.print();

        Klass class1 = context.getBean(Klass.class);
        System.out.println(class1);
        System.out.println("Klass对象AOP代理后的实际类型：" + class1.getClass());
        System.out.println("Klass对象AOP代理后的实际类型是否是Klass子类：" + (class1 instanceof Klass));

        ISchool school = context.getBean(ISchool.class);
        System.out.println(school);
        System.out.println("ISchool接口的对象AOP代理后的实际类型：" + school.getClass());

        ISchool school1 = context.getBean(ISchool.class);
        System.out.println(school1);
        System.out.println("ISchool接口的对象AOP代理后的实际类型：" + school1.getClass());

        school1.ding();

        class1.dong();

        System.out.println("   context.getBeanDefinitionNames() ===>> " + String.join(",", context.getBeanDefinitionNames()));

        Student s101 = (Student) context.getBean("s101");
        if (s101 != null) {
            System.out.println(s101);
        }
        Student s102 = (Student) context.getBean("s102");
        if (s102 != null) {
            System.out.println(s102);
        }
    }

}
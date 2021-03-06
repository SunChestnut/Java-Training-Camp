package syl.camp.springjmsdemo.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import syl.camp.springjmsdemo.example.entity.Student;

public class JmsSender {

    public static void main(String[] args) {
        Student student2 = Student.create();

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springjms-sender.xml");

        SendService sendService = (SendService) context.getBean("sendService");

        sendService.send(student2);

        System.out.println("send successfully, please visit http://localhost:8161/admin to see it");
    }

}
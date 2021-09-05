package syl.camp.springdemo.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import syl.camp.starter.bean.Student;

/**
 * @author sunyl
 * @date 2021/9/5 11:04 下午
 * @see syl.camp.springdemo.homework.controller
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    private final Student student;

    @Autowired
    public StudentController(Student student) {
        this.student = student;
    }

    @GetMapping("/name")
    public String getName() {
        return student.getId() + "-"+ student.getName();
    }

}

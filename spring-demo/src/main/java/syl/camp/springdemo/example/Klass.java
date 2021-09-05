package syl.camp.springdemo.example;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
public class Klass {

    List<Student> students;

    public void dong() {
        log.info("=> Klass students : {}", this.getStudents());
    }

}

package syl.camp.springjmsdemo.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author sunyl
 * @date 2021/9/3 10:30 下午
 * @see syl.camp.springjmsdemo.example.entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = -2576733971901262150L;

    private int id;

    private String name;

    public static Student create() {
        return new Student(999, "YYDS✌️");
    }
}

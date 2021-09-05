package syl.camp.springdemo.homework.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunyl
 * @date 2021/9/5 7:56 下午
 * @see syl.camp.springdemo.homework.entity
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String id;

    private String firstName;

    private String lastName;

}

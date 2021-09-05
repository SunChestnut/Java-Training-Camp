package syl.camp.springdemo.homework.service;

import syl.camp.springdemo.homework.entity.Person;

import java.util.List;

/**
 * @author sunyl
 * @date 2021/9/5 6:21 下午
 * @see syl.camp.springdemo.homework
 */
public interface PersonService {

    void addPerson(Person person);

    List<Person> queryAll();

    void updateInfo(Person person);

    void removePerson(String id);

    void addBatch(List<Person> personList);

}

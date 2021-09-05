package syl.camp.springdemo.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import syl.camp.springdemo.homework.entity.Person;
import syl.camp.springdemo.homework.service.PersonService;

import java.util.List;

/**
 * @author sunyl
 * @date 2021/9/5 6:31 下午
 * @see syl.camp.springdemo.homework
 */
@SpringBootTest
class SimpleSqlTest {

    @Autowired
    private PersonService personService;

    @Test
    void insert() {
        personService.addPerson(Person.builder()
                .id("1")
                .firstName("Di")
                .lastName("Hu")
                .build());
    }

    @Test
    void query() {
        List<Person> personList = personService.queryAll();
        System.out.println(personList);
    }

    @Test
    void updateInfo() {
        personService.updateInfo(Person.builder()
                .id("1")
                .firstName("Jiu")
                .build());
    }

    @Test
    void removePerson() {
        personService.removePerson("1");
    }


    // TODO: 2021/9/5  CRUD - @Transient
}
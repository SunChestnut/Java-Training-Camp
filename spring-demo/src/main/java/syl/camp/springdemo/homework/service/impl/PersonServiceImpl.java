package syl.camp.springdemo.homework.service.impl;

import org.springframework.stereotype.Service;
import syl.camp.springdemo.homework.config.MySqlConfig;
import syl.camp.springdemo.homework.entity.Person;
import syl.camp.springdemo.homework.service.PersonService;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyl
 * @date 2021/9/5 7:55 下午
 * @see syl.camp.springdemo.homework.service.impl
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    private MySqlConfig connect;

    @Override
    public void addPerson(Person person) {
        String insertSql = "INSERT INTO person(id,first_name,last_name) VALUES(?,?,?)";
        Connection connection = connect.connection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, person.getId());
            preparedStatement.setString(2, person.getFirstName());
            preparedStatement.setString(3, person.getLastName());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Person> queryAll() {
        String queryAllSql = "SELECT * FROM person";
        Connection connection = connect.connection();
        List<Person> personList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryAllSql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                Person person = Person.builder()
                        .id(id)
                        .firstName(firstName)
                        .lastName(lastName)
                        .build();
                personList.add(person);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return personList;
    }

    @Override
    public void updateInfo(Person person) {
        String updateSql = "UPDATE person SET first_name = ? WHERE id = ?";
        Connection connection = connect.connection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setString(1, person.getFirstName());
            preparedStatement.setString(2, person.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void removePerson(String id) {
        String updateSql = "DELETE FROM person WHERE id = ?";
        Connection connection = connect.connection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setString(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addBatch(List<Person> personList) {
        String insertSql = "INSERT INTO person(id,first_name,last_name) VALUES(?,?,?)";
        Connection connection = connect.connection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            for (Person person : personList) {
                preparedStatement.setString(1, person.getId());
                preparedStatement.setString(2, person.getFirstName());
                preparedStatement.setString(3, person.getLastName());

                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}

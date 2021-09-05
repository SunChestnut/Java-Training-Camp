package syl.camp.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import syl.camp.starter.bean.Student;
import syl.camp.starter.config.StudentProperties;

/**
 * @author sunyl
 * @date 2021/9/5 10:02 下午
 * @see syl.camp.awesomesylstarter
 */
@Configuration
@EnableConfigurationProperties(StudentProperties.class)
@ConditionalOnProperty(prefix = "awesome.spring.boot", name = "enabled", havingValue = "true", matchIfMissing = true)
public class AwesomeAutoConfiguration {

    @Autowired
    private StudentProperties studentProperties;

    @Bean
    @ConditionalOnMissingBean(Student.class)
    public Student awesomeStudent() {

        Student student = new Student();
        student.setId(studentProperties.getId());
        student.setName(studentProperties.getName());

        return student;
    }

}

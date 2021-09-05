package syl.camp.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunyl
 */
@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

//    // ==== 测试自动配置 ====
//    @Autowired
//    WebInfo info;
//
//    @Bean
//    public void printInfo() {
//        System.out.println(info.getName());
//    }

}

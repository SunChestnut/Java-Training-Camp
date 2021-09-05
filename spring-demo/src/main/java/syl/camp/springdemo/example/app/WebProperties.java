package syl.camp.springdemo.example.app;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "web")
public class WebProperties {

    private String type = "SpringBootAutoConfigure";

}
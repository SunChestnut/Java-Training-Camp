package syl.camp.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author sunyl
 * @date 2021/9/5 10:06 下午
 * @see syl.camp.starter.config
 */
@ConfigurationProperties(prefix = "awesome.spring.boot")
public final class StudentProperties {

    public static final Integer DEFAULT_ID = 666;
    public static final String DEFAULT_NAME = "Syl✌️";

    private int id = DEFAULT_ID;

    private String name = DEFAULT_NAME;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

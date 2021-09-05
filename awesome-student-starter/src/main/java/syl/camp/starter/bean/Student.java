package syl.camp.starter.bean;

import java.io.Serializable;

/**
 * @author sunyl
 * @date 2021/9/5 10:25 下午
 * @see syl.camp.starter
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 4704201273535468678L;

    private int id;

    private String name;

    public String sayHello() {
        return "Hello," + id + "," + name;
    }

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

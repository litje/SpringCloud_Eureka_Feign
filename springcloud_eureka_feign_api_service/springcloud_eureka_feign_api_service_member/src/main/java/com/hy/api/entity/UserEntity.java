package com.hy.api.entity;

/**
 * @author litianjie
 * @ClassName UserEntity
 * @Description TODO
 * @Date 2019/1/18 15:44
 * @Version 1.0
 **/
public class UserEntity {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.example.pursue.mvvmdemo;

import java.io.Serializable;

/**
 * person实体类
 */
public class Person implements Serializable {

    private String name;
    private String hobby;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

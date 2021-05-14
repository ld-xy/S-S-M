package com.task.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String username;

    private Integer age;

    private String sex;

    private Float salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
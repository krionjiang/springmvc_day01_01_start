package com.jlq.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/18 14:52
 */

public class User implements Serializable {

    private String username;
    private Integer age;

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}



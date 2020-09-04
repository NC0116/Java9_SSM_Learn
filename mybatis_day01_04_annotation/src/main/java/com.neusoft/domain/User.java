package com.neusoft.domain;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String address;
    private Date birthday;
    private String sex;

    public User() {
    }

    public User(Integer id, String name, String address, Date birthday, String sex) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.birthday = birthday;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "IUserDao{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                '}';
    }
}

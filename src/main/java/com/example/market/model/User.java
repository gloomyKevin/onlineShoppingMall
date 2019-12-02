package com.example.market.model;

public class User {
    private int id;
    private String name;
    private  String password;
    private  String phone;
    private int sex;

    public User() {
    }

    public User(int id, String name, String password, String phone, int sex) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}

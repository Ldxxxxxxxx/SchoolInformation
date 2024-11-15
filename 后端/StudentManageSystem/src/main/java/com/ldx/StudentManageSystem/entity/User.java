package com.ldx.StudentManageSystem.entity;

public class User {
    private int id;
    private String name;
    private String pwd;
    private String type;
    private int birth;
    public User() {
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

    // pwd的getter和setter
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    // type的getter和setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}
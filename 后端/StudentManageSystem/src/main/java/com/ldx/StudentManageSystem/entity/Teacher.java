package com.ldx.StudentManageSystem.entity;

public class Teacher {
    private Integer tid;
    private String tname;
    private Integer tage;
    private String tgender;

    public Teacher() {
    }

    public Integer getId() {
        return tid;
    }

    public void setId(Integer tid) {
        this.tid = tid;
    }

    public String getName() {
        return tname;
    }

    public void setName(String tname) {
        this.tname = tname;
    }

    public Integer getAge() {
        return tage;
    }

    public void setAge(Integer tage) {
        this.tage = tage;
    }

    public String getGender() {
        return tgender;
    }

    public void setGender(String tgender) {
        this.tgender = tgender;
    }
}


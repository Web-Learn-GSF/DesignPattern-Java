package com.example.结构型模式.过滤器模式;

import java.util.List;
import java.util.ArrayList;

class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', gender='" + gender + "', maritalStatus='" + maritalStatus + "'}";
    }
}

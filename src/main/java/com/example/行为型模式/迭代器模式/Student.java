package com.example.行为型模式.迭代器模式;

import lombok.Data;

/**
 * @author Created by njy on 2023/6/25
 * 学生实体类
 */
@Data
public class Student {
    private String name;
    private Integer age;
    public Student(String name,Integer age){
        this.age=age;
        this.name=name;
    }
}
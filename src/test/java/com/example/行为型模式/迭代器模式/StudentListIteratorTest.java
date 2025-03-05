package com.example.行为型模式.迭代器模式;

import junit.framework.TestCase;

public class StudentListIteratorTest extends TestCase {
    public static void main(String[] args) {
        ClassList classList = new ClassList();
        // 添加学生信息
        classList.add(new Student("张三", 18));
        classList.add(new Student("李四", 19));
        classList.add(new Student("王五", 20));
        // 获取迭代器，遍历学生信息
        StudentIterator iterator = classList.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("学生姓名：" + student.getName() + "，学生年龄：" + student.getAge());
        }
    }
}
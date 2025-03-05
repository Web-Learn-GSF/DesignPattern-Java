package com.example.行为型模式.观察者模式;

import junit.framework.TestCase;

public class SubjectTest extends TestCase {
    public static void main(String[] args) {
        //测试用例：
        //定义主题
        Subject subject = new Subject();
        //定义观察者并添加观察者对象
        Task1 observer1 = new Task1();
        Task2 observer2 = new Task2();
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        //进行事件通知
        subject.notifyObserver("xxx");

        //移除一个事件
        subject.remove(observer1);
        //再次发布一个事件
        subject.notifyObserver("yyy");
    }
}
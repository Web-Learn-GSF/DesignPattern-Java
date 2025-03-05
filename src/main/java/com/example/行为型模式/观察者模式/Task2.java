package com.example.行为型模式.观察者模式;

class Task2 implements Observer{
        @Override
        public void update(Object object) {
            System.out.println("task2 received: "+object);
        }
}

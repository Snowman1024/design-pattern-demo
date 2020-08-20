package com.snowman.design.pattern.behavioralPattern.observer.one;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 15:44
 * @Version 1.0
 **/
public class Test {
    
    public static void main(String[] args){
        Subject subject = new ConcreteSubject();

        Observer o1 = new ConcreteObserver1();
        Observer o2 = new ConcreteObserver2();

        subject.add(o1);
        subject.add(o2);

        subject.notifyObserver();

    }
}

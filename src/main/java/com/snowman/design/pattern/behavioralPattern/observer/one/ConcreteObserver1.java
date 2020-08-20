package com.snowman.design.pattern.behavioralPattern.observer.one;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 15:43
 * @Version 1.0
 **/
public class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者1做出反应");
    }
}
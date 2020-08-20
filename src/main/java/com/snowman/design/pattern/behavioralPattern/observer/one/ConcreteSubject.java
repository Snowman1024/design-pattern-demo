package com.snowman.design.pattern.behavioralPattern.observer.one;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 15:39
 * @Version 1.0
 **/
public class ConcreteSubject extends Subject {

    /**
     * 实现通知观察者方法
     */
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变");
        System.out.println("------------");

        for (Observer observer : observerList) {
            observer.response();
        }
    }
}

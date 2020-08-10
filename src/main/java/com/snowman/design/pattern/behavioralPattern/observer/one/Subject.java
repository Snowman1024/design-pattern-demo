package com.snowman.design.pattern.behavioralPattern.observer.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 抽象主题
 * 保持抽象观察者引用
 * @Author guoqf
 * @Date 2020/7/22 15:35
 * @Version 1.0
 **/
public abstract class Subject {

    protected List<Observer> observerList = new ArrayList<>();

    /**
     * 增加观察值
     * @param observer
     */
    public void add(Observer observer){
        observerList.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void remove(Observer observer){
        observerList.remove(observer);
    }


    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();


}

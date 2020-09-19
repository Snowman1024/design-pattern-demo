package com.snowman.design.pattern.behavioralPattern.observer.c;

import java.util.Observable;

/**
 * @Description 具体目标类：原油期货
 * @Author Snowman1024
 * @Date 2020/7/22 16:19
 * @Version 1.0
 **/
public class OilFutures extends Observable {

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        //设置内部标志位，注明数据发生变化
        super.setChanged();
        //通知观察者价格改变了
        super.notifyObservers(price);

        this.price = price;
    }
}

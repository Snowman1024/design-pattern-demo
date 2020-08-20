package com.snowman.design.pattern.behavioralPattern.observer.three;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description 具体观察者类：空方
 * @Author Snowman1024
 * @Date 2020/7/22 16:21
 * @Version 1.0
 **/
public class BearObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();

        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}

package com.snowman.design.pattern.behavioralPattern.observer.c;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 16:21
 * @Version 1.0
 **/
public class BullObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();

        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
        }
    }
}

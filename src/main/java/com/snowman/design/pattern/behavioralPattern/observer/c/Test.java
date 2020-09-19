package com.snowman.design.pattern.behavioralPattern.observer.c;

import java.util.Observer;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 16:24
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        //多方
        Observer bull = new BullObserver();
        //空方
        Observer bear = new BearObserver();
        oil.addObserver(bull);
        oil.addObserver(bear);

        oil.setPrice(10);
        oil.setPrice(-8);
    }
}

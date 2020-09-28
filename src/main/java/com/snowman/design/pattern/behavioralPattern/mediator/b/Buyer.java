package com.snowman.design.pattern.behavioralPattern.mediator.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/24 17:19
 * @Version 1.0
 **/
public class Buyer extends Customer {


    public Buyer(String name) {
        super(name);
    }

    @Override
    public void send(String ad) {
        System.out.println("我(买方)说: " + ad);
        medium.relay(name, ad);
    }

    @Override
    public void receive(String from, String ad) {
        System.out.println(from + "说: " + ad);
    }
}

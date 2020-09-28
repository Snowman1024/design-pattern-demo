package com.snowman.design.pattern.behavioralPattern.mediator.b;

/**
 * @Description 具体同事类：卖方
 * @Author Snowman1024
 * @Date 2020/9/24 17:17
 * @Version 1.0
 **/
public class Seller extends Customer {

    public Seller(String name) {
        super(name);
    }

    @Override
    public void send(String ad) {
        System.out.println("我(卖方)说: " + ad);
        medium.relay(name, ad);
    }

    @Override
    public void receive(String from, String ad) {
        System.out.println(from + "说: " + ad);
    }
}

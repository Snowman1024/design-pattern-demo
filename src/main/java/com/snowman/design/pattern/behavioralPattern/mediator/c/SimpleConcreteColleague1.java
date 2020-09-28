package com.snowman.design.pattern.behavioralPattern.mediator.c;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/24 17:35
 * @Version 1.0
 **/
public class SimpleConcreteColleague1 implements SimpleColleague {

    SimpleConcreteColleague1() {
        SimpleMediator smd = SimpleMediator.getMedium();
        smd.register(this);
    }


    @Override
    public void receive() {
        System.out.println("具体同事类1：收到请求。");
    }

    @Override
    public void send() {
        SimpleMediator smd = SimpleMediator.getMedium();
        System.out.println("具体同事类1：发出请求...");
        //请中介者转发
        smd.relay(this);
    }
}

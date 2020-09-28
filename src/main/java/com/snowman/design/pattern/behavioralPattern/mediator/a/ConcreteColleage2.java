package com.snowman.design.pattern.behavioralPattern.mediator.a;

/**
 * @Description 具体同事类2
 * @Author Snowman1024
 * @Date 2020/9/24 16:38
 * @Version 1.0
 **/
public class ConcreteColleage2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发送请求");
        //请中介者转发
        mediator.relay(this);
    }
}

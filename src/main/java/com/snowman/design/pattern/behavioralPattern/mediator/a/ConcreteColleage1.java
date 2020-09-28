package com.snowman.design.pattern.behavioralPattern.mediator.a;

/**
 * @Description 具体同事类1
 * @Author Snowman1024
 * @Date 2020/9/24 16:38
 * @Version 1.0
 **/
public class ConcreteColleage1 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发送请求");
        //请中介者转发
        mediator.relay(this);
    }
}

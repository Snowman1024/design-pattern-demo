package com.snowman.design.pattern.behavioralPattern.mediator.a;

/**
 * @Description 抽象同事类
 * @Author Snowman1024
 * @Date 2020/9/24 16:35
 * @Version 1.0
 **/
public abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}

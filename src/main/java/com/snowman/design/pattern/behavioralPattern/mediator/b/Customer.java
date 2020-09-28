package com.snowman.design.pattern.behavioralPattern.mediator.b;

/**
 * @Description 抽象同事类：客户
 * @Author Snowman1024
 * @Date 2020/9/24 17:12
 * @Version 1.0
 **/
public abstract class Customer {

    protected Medium medium;
    protected String name;

    public Customer(String name) {
        this.name = name;
    }


    public void setMedium(Medium medium) {
        this.medium = medium;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void send(String ad);

    public abstract void receive(String from, String ad);
}

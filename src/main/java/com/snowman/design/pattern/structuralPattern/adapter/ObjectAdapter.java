package com.snowman.design.pattern.structuralPattern.adapter;

/**
 * @Description 对象模式适配器
 * @Author Snowman1024
 * @Date 2020/7/21 15:44
 * @Version 1.0
 **/
public class ObjectAdapter implements Target {

    private Adaptee adaptee;


    public ObjectAdapter(Adaptee adaptee){
        System.out.println("对象模式适配器..");
        this.adaptee= adaptee;
    }

    @Override
    public void request() {

        adaptee.specificRequest();
    }
}

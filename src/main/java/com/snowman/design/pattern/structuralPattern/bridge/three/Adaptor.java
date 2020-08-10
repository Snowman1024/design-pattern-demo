package com.snowman.design.pattern.structuralPattern.bridge.three;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/31 15:50
 * @Version 1.0
 **/
public class Adaptor extends ConcreteImplementorA {

    private Adaptee adaptee;

    protected Adaptor(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public void operationImpl() {
        System.out.println("适配器的方法被调用...");
        adaptee.show();
    }
}

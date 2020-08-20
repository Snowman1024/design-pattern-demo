package com.snowman.design.pattern.structuralPattern.adapter;

/**
 * @Description 类模式适配器
 * @Author Snowman1024
 * @Date 2020/7/21 15:35
 * @Version 1.0
 **/
public class ClassAdaper extends Adaptee implements Target {

    @Override
    public void request() {

        super.specificRequest();
    }
}

package com.snowman.design.pattern.structuralPattern.bridge.one;

/**
 * @Description 具体实现A
 * @Author Snowman1024
 * @Date 2020/7/31 15:28
 * @Version 1.0
 **/
public class ConcreteImplementorA implements Implementor {


    @Override
    public void operationImpl() {
        System.out.println("具体实现化角色A被访问");
    }
}

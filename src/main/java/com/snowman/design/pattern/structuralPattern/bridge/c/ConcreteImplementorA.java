package com.snowman.design.pattern.structuralPattern.bridge.c;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/31 15:46
 * @Version 1.0
 **/
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("具体实现角色A被调用");
    }
}

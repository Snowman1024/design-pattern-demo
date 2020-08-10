package com.snowman.design.pattern.structuralPattern.bridge.three;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/31 15:46
 * @Version 1.0
 **/
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现角色B被调用");
    }
}

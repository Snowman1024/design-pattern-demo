package com.snowman.design.pattern.structuralPattern.bridge.three;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/31 15:48
 * @Version 1.0
 **/
public class RefinedAbstractionA extends Abstraction {


    protected RefinedAbstractionA(Implementor implementor) {
        super(implementor);
    }

    @Override
    protected void operate() {
        System.out.println("扩展抽象角色A被调用");
        implementor.operationImpl();
    }
}

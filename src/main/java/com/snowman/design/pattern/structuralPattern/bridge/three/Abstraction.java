package com.snowman.design.pattern.structuralPattern.bridge.three;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/31 15:47
 * @Version 1.0
 **/
public abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor){
        this.implementor =implementor;
    }

    protected abstract void operate();
}

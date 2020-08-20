package com.snowman.design.pattern.structuralPattern.bridge.one;

/**
 * @Description 抽象化角色
 * @Author Snowman1024
 * @Date 2020/7/31 15:26
 * @Version 1.0
 **/
public abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    protected abstract void operation();


}

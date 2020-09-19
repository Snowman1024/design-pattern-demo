package com.snowman.design.pattern.structuralPattern.bridge.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/31 15:39
 * @Version 1.0
 **/
public abstract class Bag {

    protected Color color;

    protected Bag(Color color){
        this.color=color;
    }

    protected abstract void show();
}

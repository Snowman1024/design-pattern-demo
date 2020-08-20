package com.snowman.design.pattern.structuralPattern.bridge.two;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/31 15:40
 * @Version 1.0
 **/
public class HandBag extends Bag {

    protected HandBag(Color color) {
        super(color);
    }


    @Override
    protected void show() {
        System.out.println("我是手包，我的颜色是:" + color.getColor());
    }
}

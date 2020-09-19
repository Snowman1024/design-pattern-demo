package com.snowman.design.pattern.structuralPattern.bridge.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/31 15:42
 * @Version 1.0
 **/
public class Wallet extends Bag {

    protected Wallet(Color color) {
        super(color);
    }

    @Override
    protected void show() {
        System.out.println("我是钱包，我的颜色是:" + color.getColor());
    }
}

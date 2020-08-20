package com.snowman.design.pattern.structuralPattern.bridge.two;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/31 15:43
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Color r = new Red();
        Color y = new Yellow();

        Bag b1 = new HandBag(r);
        b1.show();

        Bag b2 = new Wallet(y);
        b2.show();

    }
}

package com.snowman.design.pattern.structuralPattern.flyweight;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/2 11:13
 * @Version 1.0
 **/
public class Test {


    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        Flyweight f02 = factory.getFlyweight("a");
        Flyweight f03 = factory.getFlyweight("a");
        Flyweight f11 = factory.getFlyweight("b");
        Flyweight f12 = factory.getFlyweight("b");

        f01.operation(new UnFlyweight("第1次调用a。"));
        f02.operation(new UnFlyweight("第2次调用a。"));
        f03.operation(new UnFlyweight("第3次调用a。"));
        f11.operation(new UnFlyweight("第1次调用b。"));
        f12.operation(new UnFlyweight("第2次调用b。"));
    }

}

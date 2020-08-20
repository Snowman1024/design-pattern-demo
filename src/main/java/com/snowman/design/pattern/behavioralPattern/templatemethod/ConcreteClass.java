package com.snowman.design.pattern.behavioralPattern.templatemethod;

/**
 * @Description 具体子类
 * @Author Snowman1024
 * @Date 2020/7/23 16:52
 * @Version 1.0
 **/
public class ConcreteClass extends AbstractClass {

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    public void hookMethod1() {
        System.out.println("钩子方法1被重写...");
    }

    @Override
    public boolean hookMethod2() {
        System.out.println("钩子方法2被重写...");
        return false;
    }
}

package com.snowman.design.pattern.structuralPattern.bridge.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/31 15:34
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        Implementor ia = new ConcreteImplementorA();
        Abstraction a = new RefinedAbstraction(ia);
        a.operation();
    }
}

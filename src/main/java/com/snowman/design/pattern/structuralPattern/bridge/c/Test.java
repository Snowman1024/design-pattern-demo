package com.snowman.design.pattern.structuralPattern.bridge.c;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/31 15:53
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args){

        Adaptee adaptee = new Adaptee();
        Implementor ia = new Adaptor(adaptee);

        Abstraction a = new RefinedAbstractionA(ia);
        a.operate();
    }
}

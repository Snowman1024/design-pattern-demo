package com.snowman.design.pattern.structuralPattern.decorator;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 15:15
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Componet p = new ConcreteComponent();
        p.operation();

        Componet d = new ConcreteDecorator(p);
        d.operation();

    }
}

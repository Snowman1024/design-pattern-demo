package com.snowman.design.pattern.createPattern.factorymethod;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/21 15:12
 * @Version 1.0
 **/
public class ConcreteProduct1 implements Product {

    @Override
    public void show() {
        System.out.println("具体产品1展示...");
    }
}

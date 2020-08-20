package com.snowman.design.pattern.createPattern.factorymethod;

/**
 * @Description 工厂方法
 * @Author Snowman1024
 * @Date 2020/7/21 15:16
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args){

        AbstractFactory factory1 = new ConcreteFactory1();
        Product product1 = factory1.newProduct();
        product1.show();


        AbstractFactory factory2 = new ConcreteFactory2();
        Product product2 = factory2.newProduct();
        product2.show();

    }
}

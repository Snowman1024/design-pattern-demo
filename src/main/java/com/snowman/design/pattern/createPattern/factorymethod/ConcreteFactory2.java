package com.snowman.design.pattern.createPattern.factorymethod;

/**
 * @Description 具体工厂2
 * @Author Snowman1024
 * @Date 2020/7/21 15:10
 * @Version 1.0
 **/
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生产-->>具体产品2");
        return new ConcreteProduct2();
    }
}

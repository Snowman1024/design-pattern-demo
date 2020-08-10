package com.snowman.design.pattern.createPattern.abstractfactory;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/27 13:57
 * @Version 1.0
 **/
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂2，生成具体产品1...");
        return new Product1();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂2，生成具体产品2...");
        return new Product2();
    }
}

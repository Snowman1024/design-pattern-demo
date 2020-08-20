package com.snowman.design.pattern.createPattern.abstractfactory;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/27 13:57
 * @Version 1.0
 **/
public class Test {


    public static void main(String[] args) {

        AbstractFactory factory1 = new ConcreteFactory1();
        factory1.newProduct1();
        factory1.newProduct2();


        AbstractFactory factory2 = new ConcreteFactory2();
        factory2.newProduct1();
        factory2.newProduct2();
    }


}

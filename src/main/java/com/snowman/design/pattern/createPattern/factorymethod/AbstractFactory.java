package com.snowman.design.pattern.createPattern.factorymethod;

/**
 * @Description 抽象工厂
 * 当需要生成的产品不多且不会增加，一个具体工厂类就可以完成任务时，
 * 可删除抽象工厂类。这时工厂方法模式将退化到简单工厂模式
 * @Author Snowman1024
 * @Date 2020/7/21 15:08
 * @Version 1.0
 **/
public interface AbstractFactory {

    public Product newProduct();
}

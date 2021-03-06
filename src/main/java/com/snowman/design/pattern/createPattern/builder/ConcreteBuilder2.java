package com.snowman.design.pattern.createPattern.builder;

/**
 * @Description 具体建造者2
 * @Author Snowman1024
 * @Date 2020/7/29 14:21
 * @Version 1.0
 **/
public class ConcreteBuilder2 extends Builder {

    @Override
    protected void buildPartA() {
        product.setPartA("具体建造者2，组装的partA");
    }

    @Override
    protected void buildPartB() {
        product.setPartB("具体建造者2，组装的partB");
    }

    @Override
    protected void buildPartC() {
        product.setPartC("具体建造者2，组装的partC");
    }
}

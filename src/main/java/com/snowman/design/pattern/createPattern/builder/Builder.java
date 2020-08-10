package com.snowman.design.pattern.createPattern.builder;

/**
 * @Description 抽象建造者
 * @Author guoqf
 * @Date 2020/7/29 14:19
 * @Version 1.0
 **/
public abstract class Builder {

    /**
     * 也可以通过构造函数传进来产品
     */
    protected Product product = new Product();

    protected abstract void buildPartA();
    protected abstract void buildPartB();
    protected abstract void buildPartC();

    public Product getResult(){
        return product;
    }
}

package com.snowman.design.pattern.createPattern.builder;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/29 14:23
 * @Version 1.0
 **/
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    /**
     * 产品构建与组装方法
     * @return
     */
    public Product build() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }

}

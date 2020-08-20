package com.snowman.design.pattern.createPattern.abstractfactory;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/27 13:52
 * @Version 1.0
 **/
public class Product1 implements AbstractProduct {

    @Override
    public void show() {
        System.out.println("具体产品1展示");
    }
}

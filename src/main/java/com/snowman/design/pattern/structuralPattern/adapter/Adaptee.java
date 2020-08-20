package com.snowman.design.pattern.structuralPattern.adapter;

/**
 * @Description 适配者
 * @Author Snowman1024
 * @Date 2020/7/21 15:34
 * @Version 1.0
 **/
public class Adaptee {

    public void specificRequest(){
        System.out.println("适配者中的代码被调用");
    }
}

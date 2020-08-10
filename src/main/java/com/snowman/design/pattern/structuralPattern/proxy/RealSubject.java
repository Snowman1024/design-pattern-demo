package com.snowman.design.pattern.structuralPattern.proxy;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/22 15:24
 * @Version 1.0
 **/
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("访问真实主题的方法request()");
    }
}

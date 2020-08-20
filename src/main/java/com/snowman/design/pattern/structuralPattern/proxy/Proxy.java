package com.snowman.design.pattern.structuralPattern.proxy;

/**
 * @Description 代理模式
 * 实现抽象主题，并保持真实主题的引用(其实也是增加额外功能，与装饰器模式有相似之处)
 * 一个真实主题绑定一个代理类
 * @Author Snowman1024
 * @Date 2020/7/22 15:25
 * @Version 1.0
 **/
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (null == realSubject) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();

    }

    private void preRequest() {
        System.out.println("访问真实主题前的预处理");
    }

    private void postRequest() {
        System.out.println("访问真实主题后的后续处理");
    }
}

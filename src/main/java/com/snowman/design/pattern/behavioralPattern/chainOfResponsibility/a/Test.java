package com.snowman.design.pattern.behavioralPattern.chainOfResponsibility.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/16 10:46
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreateHandler1();
        Handler handler2 = new ConcreateHandler2();

        handler1.setNext(handler2);
        handler1.handleRequest("two");
    }
}

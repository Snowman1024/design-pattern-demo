package com.snowman.design.pattern.behavioralPattern.visitor.a;

/**
 * @Description 抽象元素
 * @Author Snowman1024
 * @Date 2020/11/20 10:34
 * @Version 1.0
 **/
public interface Element {

    void accept(Visitor visitor);

    String operation();
}

package com.snowman.design.pattern.behavioralPattern.visitor.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 10:35
 * @Version 1.0
 **/
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    @Override
    public String operation(){
        return "具体元素A的操作。";
    }
}

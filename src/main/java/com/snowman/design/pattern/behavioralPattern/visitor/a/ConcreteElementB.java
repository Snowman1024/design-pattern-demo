package com.snowman.design.pattern.behavioralPattern.visitor.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 10:36
 * @Version 1.0
 **/
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    @Override
    public String operation(){
        return "具体元素B的操作。";
    }
}

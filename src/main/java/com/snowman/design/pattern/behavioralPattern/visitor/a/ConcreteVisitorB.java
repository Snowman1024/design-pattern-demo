package com.snowman.design.pattern.behavioralPattern.visitor.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 10:33
 * @Version 1.0
 **/
public class ConcreteVisitorB implements Visitor {

    @Override
    public void visit(Element element) {
        System.out.println("具体访问者B访问-->" + element.operation());
    }

}

package com.snowman.design.pattern.behavioralPattern.visitor.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 10:47
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());

        os.accept(new ConcreteVisitorA());
        System.out.println("-------------------");
        os.accept(new ConcreteVisitorB());
    }
}

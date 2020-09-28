package com.snowman.design.pattern.behavioralPattern.mediator.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/24 16:54
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new ConcretaMediator();

        Colleague colleague1 = new ConcreteColleage1();
        Colleague colleague2 = new ConcreteColleage2();

        mediator.register(colleague1);
        mediator.register(colleague2);
        colleague1.send();
        System.out.println("--------");
        colleague2.send();
    }
}

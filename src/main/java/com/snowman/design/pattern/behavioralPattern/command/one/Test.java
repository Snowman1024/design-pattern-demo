package com.snowman.design.pattern.behavioralPattern.command.one;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/8/10 10:30
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args){
        AbstractCommand command1 = new ConcreteCommand1();

        Invoker invoker = new Invoker(command1);
        System.out.println("客户访问call方法...");
        invoker.call();

        AbstractCommand command2 = new ConcreteCommand2();
        invoker.setCommand(command2);
        System.out.println("客户访问call方法...");
        invoker.call();

    }
}

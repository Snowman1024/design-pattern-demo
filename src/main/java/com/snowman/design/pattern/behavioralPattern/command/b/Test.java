package com.snowman.design.pattern.behavioralPattern.command.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/8/10 10:41
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        AbstractCommand cmd1 = new ConcreteCommand1();
        AbstractCommand cmd2 = new ConcreteCommand2();
        Invoker ir = new Invoker();
        ir.add(cmd1);
        ir.add(cmd2);
        System.out.println("客户访问调用者的execute()方法...");
        ir.execute();
    }
}

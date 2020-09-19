package com.snowman.design.pattern.behavioralPattern.command.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/8/10 10:22
 * @Version 1.0
 **/
public class ConcreteCommand2 implements AbstractCommand {

    private Receiver2 receiver2;

    public ConcreteCommand2() {
        receiver2 = new Receiver2();
    }

    @Override
    public void execute() {
        receiver2.action();
    }
}

package com.snowman.design.pattern.behavioralPattern.command.one;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/8/10 10:22
 * @Version 1.0
 **/
public class ConcreteCommand1 implements AbstractCommand {

    private Receiver1 receiver1;

    public ConcreteCommand1() {
        receiver1 = new Receiver1();
    }

    @Override
    public void execute() {
        receiver1.action();
    }
}

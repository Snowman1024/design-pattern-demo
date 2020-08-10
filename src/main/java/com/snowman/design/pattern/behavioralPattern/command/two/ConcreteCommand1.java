package com.snowman.design.pattern.behavioralPattern.command.two;


/**
 * @Description
 * @Author guoqf
 * @Date 2020/8/10 10:22
 * @Version 1.0
 **/
public class ConcreteCommand1 implements AbstractCommand {

    private Receiver receiver;

    public ConcreteCommand1() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action1();
    }
}

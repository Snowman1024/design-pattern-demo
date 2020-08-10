package com.snowman.design.pattern.behavioralPattern.command.two;


/**
 * @Description
 * @Author guoqf
 * @Date 2020/8/10 10:22
 * @Version 1.0
 **/
public class ConcreteCommand2 implements AbstractCommand {

    private Receiver receiver;

    public ConcreteCommand2() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}

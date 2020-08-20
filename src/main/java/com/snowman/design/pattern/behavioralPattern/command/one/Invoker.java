package com.snowman.design.pattern.behavioralPattern.command.one;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/8/10 10:28
 * @Version 1.0
 **/
public class Invoker {

    private AbstractCommand command;

    public Invoker(AbstractCommand command){
        this.command=command;
    }

    public void setCommand(AbstractCommand command){
        this.command=command;
    }

    public void call(){
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}

package com.snowman.design.pattern.behavioralPattern.command.two;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description 组合命令模式(宏命令)
 * @Author Snowman1024
 * @Date 2020/8/10 10:28
 * @Version 1.0
 **/
public class Invoker implements AbstractCommand {

    private List<AbstractCommand> commandList = new ArrayList<>();


    public void add(AbstractCommand c) {
        commandList.add(c);
    }

    public void remove(AbstractCommand c) {
        commandList.remove(c);
    }

    public AbstractCommand getChild(int i) {
        return commandList.get(i);
    }


    @Override
    public void execute() {

        for (AbstractCommand command : commandList) {
            command.execute();
        }
    }
}

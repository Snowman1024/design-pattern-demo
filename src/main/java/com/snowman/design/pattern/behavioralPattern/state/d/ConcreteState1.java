package com.snowman.design.pattern.behavioralPattern.state.d;

/**
 * @Description 具体状态1类
 * @Author Snowman1024
 * @Date 2020/9/19 15:30
 * @Version 1.0
 **/
public class ConcreteState1 extends ShareState {

    @Override
    public void handle(ShareContext context) {
        System.out.println("当前状态是： 状态1");
        context.setState(context.getState("2"));
    }
}

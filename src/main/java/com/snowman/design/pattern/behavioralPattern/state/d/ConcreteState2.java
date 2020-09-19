package com.snowman.design.pattern.behavioralPattern.state.d;

/**
 * @Description 具体状态2类
 * @Author Snowman1024
 * @Date 2020/9/19 15:31
 * @Version 1.0
 **/
public class ConcreteState2 extends ShareState {

    @Override
    public void handle(ShareContext context) {
        System.out.println("当前状态是： 状态2");
        context.setState(context.getState("1"));
    }
}

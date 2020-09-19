package com.snowman.design.pattern.behavioralPattern.state.a;

/**
 * @Description 具体状态A
 * @Author Snowman1024
 * @Date 2020/9/18 11:06
 * @Version 1.0
 **/
public class ConcreteStateA extends AbstractState {

    @Override
    public void handle(Context context) {
        System.out.println("当前状态A");
        //改变状态，反馈给上下文
        AbstractState state = new ConcreteStateB();
        context.setState(state);
    }
}

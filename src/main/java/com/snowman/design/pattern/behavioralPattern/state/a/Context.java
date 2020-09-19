package com.snowman.design.pattern.behavioralPattern.state.a;

import lombok.Data;

/**
 * @Description 环境类
 * @Author Snowman1024
 * @Date 2020/9/16 15:45
 * @Version 1.0
 **/
@Data
public class Context {

    private AbstractState state;

    /**
     * 定义环境类 初始状态
     */
    public Context() {
        this.state = new ConcreteStateA();
    }

    /**
     * 对请求做处理
     */
    public void invoke() {
        state.handle(this);
    }

}

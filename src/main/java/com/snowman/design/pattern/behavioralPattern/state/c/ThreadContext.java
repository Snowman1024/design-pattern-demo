package com.snowman.design.pattern.behavioralPattern.state.c;

import lombok.Data;

/**
 * @Description 环境类 ,所有改变状态的方法都写在上下文中；
 * 也可以写在具体的状态类中，然后把改变后的状态反馈给上下文（类似one包下的写法）
 * @Author Snowman1024
 * @Date 2020/9/19 14:28
 * @Version 1.0
 **/
@Data
public class ThreadContext {

    private ThreadState state;


    public ThreadContext() {
        state = new New();
    }


    public void start() {
        ((New) state).start(this);
    }

    public void getCPU() {
        ((Runnable) state).getCPU(this);
    }

    public void suspend() {
        ((Running) state).suspend(this);
    }

    public void stop() {
        ((Running) state).stop(this);
    }


    public void resume() {
        ((Blocked) state).resume(this);
    }

}

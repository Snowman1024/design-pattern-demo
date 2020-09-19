package com.snowman.design.pattern.behavioralPattern.state.c;

/**
 * @Description 具体状态：运行状态
 * @Author Snowman1024
 * @Date 2020/9/19 14:32
 * @Version 1.0
 **/
public class Running extends ThreadState {

    public Running() {
        stateName = "运行";
        System.out.println("当前线程处于：运行状态");
    }

    /**
     * 阻塞
     * @param context
     */
    public void suspend(ThreadContext context) {
        System.out.print("调用suspend()方法-->");

        if (stateName.equals("运行")) {
            context.setState(new Blocked());
        } else {
            System.out.println("当前线程不是运行状态，不能调用suspend()方法");
        }
    }

    /**
     * 停止
     * @param context
     */
    public void stop(ThreadContext context) {
        System.out.print("调用stop()方法-->");

        if (stateName.equals("运行")) {
            context.setState(new Dead());
        } else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法");
        }
    }
}

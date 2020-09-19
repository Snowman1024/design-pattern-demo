package com.snowman.design.pattern.behavioralPattern.state.c;

/**
 * @Description 具体状态：新建状态
 * @Author Snowman1024
 * @Date 2020/9/19 14:32
 * @Version 1.0
 **/
public class New extends ThreadState {

    public New() {
        stateName = "新建";
        System.out.println("当前线程处于：新建状态");
    }

    /**
     * 启动
     * @param context
     */
    public void start(ThreadContext context) {
        System.out.print("调用start()方法-->");

        if (stateName.equals("新建")) {
            context.setState(new Runnable());
        } else {
            System.out.println("当前线程不是新建状态，不能调用start()方法");
        }
    }
}

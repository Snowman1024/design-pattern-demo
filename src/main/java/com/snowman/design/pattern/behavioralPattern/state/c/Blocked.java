package com.snowman.design.pattern.behavioralPattern.state.c;

/**
 * @Description 具体状态：阻塞状态
 * @Author Snowman1024
 * @Date 2020/9/19 14:32
 * @Version 1.0
 **/
public class Blocked extends ThreadState {

    public Blocked() {
        stateName = "阻塞";
        System.out.println("当前线程处于：阻塞状态");
    }

    public void resume(ThreadContext context) {
        System.out.print("调用resume()方法-->");

        if (stateName.equals("阻塞")) {
            context.setState(new Runnable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法");
        }
    }
}

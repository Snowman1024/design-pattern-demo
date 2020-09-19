package com.snowman.design.pattern.behavioralPattern.state.c;

/**
 * @Description 具体状态：就绪状态
 * @Author Snowman1024
 * @Date 2020/9/19 14:32
 * @Version 1.0
 **/
public class Runnable extends ThreadState {

    public Runnable() {
        stateName = "就绪";
        System.out.println("当前线程处于：就绪状态");
    }

    /**
     * 获得CPU时间
     * @param context
     */
    public void getCPU(ThreadContext context) {
        System.out.print("获得CPU时间-->");

        if (stateName.equals("就绪")) {
            context.setState(new Running());
        } else {
            System.out.println("当前线程不是就绪状态，不能获取CPU");
        }
    }
}

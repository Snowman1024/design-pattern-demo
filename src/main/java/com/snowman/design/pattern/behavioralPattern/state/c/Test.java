package com.snowman.design.pattern.behavioralPattern.state.c;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/19 15:13
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();

        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
//        context.start();
        context.stop();

    }
}

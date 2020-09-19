package com.snowman.design.pattern.behavioralPattern.state.d;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/19 15:33
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        //创建环境
        ShareContext context = new ShareContext();
        //处理请求
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}

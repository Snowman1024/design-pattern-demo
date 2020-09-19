package com.snowman.design.pattern.behavioralPattern.state.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/18 16:04
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //创建环境
        Context context = new Context();
        //处理请求
        context.invoke();
        context.invoke();
        context.invoke();
        context.invoke();
    }
}

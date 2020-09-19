package com.snowman.design.pattern.behavioralPattern.observer.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 16:13
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        //铃 事件源
        BellEventSource bellEventSource = new BellEventSource();
        //注册监听器
        bellEventSource.addListener(new TeachEventListener());
        bellEventSource.addListener(new StudentEventListener());

        //打上课铃
        bellEventSource.ring(true);
        System.out.println("-----------");
        //打下课铃
        bellEventSource.ring(false);
    }
}

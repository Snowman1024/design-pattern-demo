package com.snowman.design.pattern.behavioralPattern.state.c;

/**
 * @Description 具体状态：死亡状态
 * @Author Snowman1024
 * @Date 2020/9/19 14:32
 * @Version 1.0
 **/
public class Dead extends ThreadState {

    public Dead() {
        stateName = "死亡";
        System.out.println("当前线程处于：死亡状态");
    }

}

package com.snowman.design.pattern.behavioralPattern.observer.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 15:58
 * @Version 1.0
 **/
public class TeachEventListener implements BellEventListener {


    @Override
    public void hearBell(RingEvent e) {
        if (e.isSound()) {
            System.out.println("老师上课了...");
        } else {
            System.out.println("老师下课了...");
        }
    }
}

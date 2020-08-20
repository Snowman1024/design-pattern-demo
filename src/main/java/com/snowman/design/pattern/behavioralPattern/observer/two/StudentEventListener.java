package com.snowman.design.pattern.behavioralPattern.observer.two;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 15:58
 * @Version 1.0
 **/
public class StudentEventListener implements BellEventListener {


    @Override
    public void hearBell(RingEvent e) {
        if (e.isSound()) {
            System.out.println("同学们，上课了...");
        } else {
            System.out.println("同学们，下课了...");
        }
    }
}

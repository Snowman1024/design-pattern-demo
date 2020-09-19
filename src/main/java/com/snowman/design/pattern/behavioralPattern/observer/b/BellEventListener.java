package com.snowman.design.pattern.behavioralPattern.observer.b;

import java.util.EventListener;

/**
 * @Description 抽象观察者类，铃声事件监听器
 * @Author Snowman1024
 * @Date 2020/7/22 15:51
 * @Version 1.0
 **/
public interface BellEventListener extends EventListener {

    /**
     * 事件处理方法，听到铃声
     * @param e
     */
    public void hearBell(RingEvent e);
}

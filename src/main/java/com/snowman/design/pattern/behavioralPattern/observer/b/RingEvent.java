package com.snowman.design.pattern.behavioralPattern.observer.b;

import java.util.EventObject;

/**
 * @Description 铃声事件类，用于封装事件源及一些与事件相关的参数
 * @Author Snowman1024
 * @Date 2020/7/22 15:52
 * @Version 1.0
 **/
public class RingEvent extends EventObject {

    private static final long serialVersionUID=1L;

    /**
     * true表示上课铃声，false表示下课铃声
     */
    private boolean sound;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }


    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}

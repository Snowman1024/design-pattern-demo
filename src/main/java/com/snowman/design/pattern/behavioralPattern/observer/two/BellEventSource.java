package com.snowman.design.pattern.behavioralPattern.observer.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 目标类，事件源 铃
 * @Author guoqf
 * @Date 2020/7/22 16:00
 * @Version 1.0
 **/
public class BellEventSource {

    /**
     * 监听器容器
     */
    private List<BellEventListener> listenerList;

    public BellEventSource() {
        listenerList = new ArrayList<>();
    }

    /**
     * 给事件源绑定监听器
     *
     * @param listener
     */
    public void addListener(BellEventListener listener) {
        listenerList.add(listener);
    }

    /**
     * 事件触发器：敲钟，当铃声sound值发生改变时，触发事件
     * @param sound
     */
    public void ring(boolean sound) {

        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响");
        RingEvent ringEvent = new RingEvent(this, sound);
        //通知注册在该事件源上的所有监听器
        notifies(ringEvent);
    }

    /**
     * 当事件发生时，通知绑定在改事件源上的所有监听器做出反应（调用事件处理方法）
     * @param event
     */
    protected void notifies(RingEvent event) {
        BellEventListener ren = null;
        Iterator<BellEventListener> iterator = listenerList.iterator();
        while (iterator.hasNext()) {
            ren = iterator.next();
            ren.hearBell(event);
        }
    }

}

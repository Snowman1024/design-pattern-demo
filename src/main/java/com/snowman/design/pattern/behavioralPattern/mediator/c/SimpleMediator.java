package com.snowman.design.pattern.behavioralPattern.mediator.c;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 简单单例中介者
 * @Author Snowman1024
 * @Date 2020/9/24 17:30
 * @Version 1.0
 **/
public class SimpleMediator {

    private final static SimpleMediator smd = new SimpleMediator();

    private List<SimpleColleague> colleagues = new ArrayList<>();

    private SimpleMediator() {
    }

    public static SimpleMediator getMedium() {
        return smd;
    }

    public void register(SimpleColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    public void relay(SimpleColleague scl) {
        for (SimpleColleague ob : colleagues) {
            if (!ob.equals(scl)) {
                ob.receive();
            }
        }
    }
}

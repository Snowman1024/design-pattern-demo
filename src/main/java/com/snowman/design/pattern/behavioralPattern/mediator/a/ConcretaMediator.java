package com.snowman.design.pattern.behavioralPattern.mediator.a;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 具体中介者
 * @Author Snowman1024
 * @Date 2020/9/24 16:42
 * @Version 1.0
 **/
public class ConcretaMediator extends Mediator {

    private List<Colleague> colleagueList = new ArrayList<>();

    /**
     * 注册
     *
     * @param colleague
     */
    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    /**
     * 转发
     *
     * @param colleague
     */
    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagueList) {
            if (!c.equals(colleague)) {
                c.receive();
            }
        }
    }
}

package com.snowman.design.pattern.behavioralPattern.memento.one;

import lombok.Data;

/**
 * @Description 发起人 （创建和恢复备忘录）
 * @Author guoqf
 * @Date 2020/9/1 10:20
 * @Version 1.0
 **/
@Data
public class Originator {

    private String state;

    /**
     * 创建备忘录
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录
     * @param m
     */
    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}

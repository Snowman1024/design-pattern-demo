package com.snowman.design.pattern.behavioralPattern.memento.one;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/9/1 10:25
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("S0状态");
        System.out.println("初始状态:" + originator.getState());
        //创建备忘录
        Memento s0 = originator.createMemento();
        //保存备忘录
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(s0);

        originator.setState("S1状态");
        System.out.println("新状态:" + originator.getState());

        //恢复状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态后:" + originator.getState());
    }
}

package com.snowman.design.pattern.behavioralPattern.memento.three;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/1 11:19
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args){
        OriginatorPrototype op = new OriginatorPrototype();

        PrototypeCaretaker pc = new PrototypeCaretaker();

        op.setState("S0状态");
        System.out.println("初始状态:"+op.getState());
        pc.setOp(op.createMemento());

        op.setState("S1状态");
        System.out.println("新状态:"+op.getState());

        op.restoreMemento(pc.getOp());
        System.out.println("撤销后状态:"+op.getState());

    }
}

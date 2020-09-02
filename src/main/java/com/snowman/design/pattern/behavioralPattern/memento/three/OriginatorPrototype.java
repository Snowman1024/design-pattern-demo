package com.snowman.design.pattern.behavioralPattern.memento.three;

import lombok.Data;

/**
 * @Description 发起人(原型)
 * 结合原型模式，这时备忘录就是发起人自己
 * @Author Snowman1024
 * @Date 2020/9/1 11:11
 * @Version 1.0
 **/
@Data
public class OriginatorPrototype implements Cloneable {

    private String state;


    public OriginatorPrototype createMemento(){
        OriginatorPrototype originator = clone();
        return originator;
    }


    public void restoreMemento(OriginatorPrototype prototype){
        setState(prototype.getState());
    }



    @Override
    public OriginatorPrototype clone() {
        try {
            return (OriginatorPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}

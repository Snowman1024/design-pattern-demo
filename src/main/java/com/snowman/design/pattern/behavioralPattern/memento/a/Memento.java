package com.snowman.design.pattern.behavioralPattern.memento.a;

import lombok.Data;

/**
 * @Description 备忘录
 * @Author Snowman1024
 * @Date 2020/9/1 10:18
 * @Version 1.0
 **/
@Data
public class Memento {

    private String state;

    public Memento(String state){
        this.state=state;
    }


}

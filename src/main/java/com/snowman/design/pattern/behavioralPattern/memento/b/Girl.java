package com.snowman.design.pattern.behavioralPattern.memento.b;

import lombok.Data;

/**
 * @Description 备忘录
 * @Author Snowman1024
 * @Date 2020/9/1 10:36
 * @Version 1.0
 **/
@Data
public class Girl {

    private String name;

    public Girl(String name){
        this.name = name;
    }

}

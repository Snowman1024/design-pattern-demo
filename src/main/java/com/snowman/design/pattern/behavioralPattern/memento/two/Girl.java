package com.snowman.design.pattern.behavioralPattern.memento.two;

import lombok.Data;

/**
 * @Description 备忘录
 * @Author guoqf
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

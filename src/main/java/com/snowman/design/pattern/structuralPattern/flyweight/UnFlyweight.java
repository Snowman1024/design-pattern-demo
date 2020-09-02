package com.snowman.design.pattern.structuralPattern.flyweight;

import lombok.Data;

/**
 * @Description 非享元
 * @Author Snowman1024
 * @Date 2020/9/2 10:36
 * @Version 1.0
 **/
@Data
public class UnFlyweight {

    private String info;

    public UnFlyweight(String info) {
        this.info = info;
    }
}

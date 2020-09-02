package com.snowman.design.pattern.structuralPattern.flyweight;

import java.util.HashMap;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/2 10:53
 * @Version 1.0
 **/
public class FlyweightFactory {


    private HashMap<String, Flyweight> flyweightMap = new HashMap<>();


    public Flyweight getFlyweight(String key) {

        Flyweight flyweight = flyweightMap.get(key);

        if (null == flyweight) {
            flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key, flyweight);
        } else {
            System.out.println("具体享元" + key + "已经存在，被成功获取");
        }
        return flyweight;
    }
}

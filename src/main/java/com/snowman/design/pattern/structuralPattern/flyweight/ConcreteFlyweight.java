package com.snowman.design.pattern.structuralPattern.flyweight;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/2 10:37
 * @Version 1.0
 **/
public class ConcreteFlyweight implements Flyweight {

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建");
    }


    @Override
    public void operation(UnFlyweight unFlyweight) {
        System.out.println("具体享元" + key + "被调用");
        System.out.println("非享元信息是:" + unFlyweight.getInfo());
    }
}

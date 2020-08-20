package com.snowman.design.pattern.createPattern.prototype.one;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/24 11:21
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        try {
            ConcretePrototype prototype1 = new ConcretePrototype();
            ConcretePrototype prototype2 = (ConcretePrototype)prototype1.clone();
            System.out.println("prototype1==prototype2 ?" + (prototype1 == prototype2));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

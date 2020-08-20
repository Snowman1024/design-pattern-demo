package com.snowman.design.pattern.behavioralPattern.strategy;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 16:48
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Context c = new Context();

        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();

        System.out.println("-----------------");

        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}

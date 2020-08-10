package com.snowman.design.pattern.behavioralPattern.strategy;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/22 16:43
 * @Version 1.0
 **/
public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}

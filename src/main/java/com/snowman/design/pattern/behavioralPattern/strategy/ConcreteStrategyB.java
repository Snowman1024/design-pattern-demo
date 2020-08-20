package com.snowman.design.pattern.behavioralPattern.strategy;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 16:47
 * @Version 1.0
 **/
public class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}

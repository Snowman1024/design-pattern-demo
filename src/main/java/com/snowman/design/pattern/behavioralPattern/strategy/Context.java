package com.snowman.design.pattern.behavioralPattern.strategy;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 16:47
 * @Version 1.0
 **/
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}

package com.snowman.design.pattern.behavioralPattern.mediator.a;

/**
 * @Description 抽象中介者
 * @Author Snowman1024
 * @Date 2020/9/24 16:27
 * @Version 1.0
 **/
public abstract class Mediator {

    /**
     *
     * @param colleague
     */
    public abstract void register(Colleague colleague);

    /**
     * 转发
     * @param colleague
     */
    public abstract void relay(Colleague colleague);
}

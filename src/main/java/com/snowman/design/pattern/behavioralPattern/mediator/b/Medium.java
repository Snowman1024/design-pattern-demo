package com.snowman.design.pattern.behavioralPattern.mediator.b;

/**
 * @Description 抽象中介者：中介公司
 * @Author Snowman1024
 * @Date 2020/9/24 17:11
 * @Version 1.0
 **/
public interface Medium {

    /**
     * 客户注册
     *
     * @param member
     */
    void register(Customer member);

    /**
     * 转发
     *
     * @param from
     * @param ad
     */
    void relay(String from, String ad);
}

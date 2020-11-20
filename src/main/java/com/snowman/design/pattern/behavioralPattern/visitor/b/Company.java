package com.snowman.design.pattern.behavioralPattern.visitor.b;

/**
 * @Description 抽象访问者:公司
 * @Author Snowman1024
 * @Date 2020/11/20 11:09
 * @Version 1.0
 **/
public interface Company {

    String create(Paper paper);
    String create(Cuprum cuprum);
}

package com.snowman.design.pattern.behavioralPattern.iterator;

/**
 * @Description 抽象聚合
 * @Author Snowman1024
 * @Date 2020/10/12 11:10
 * @Version 1.0
 **/
public interface Aggregate {

    void add(Object obj);
    void remove(Object obj);
    Iterator getIterator();
}

package com.snowman.design.pattern.behavioralPattern.iterator;

/**
 * @Description 抽象迭代器
 * @Author Snowman1024
 * @Date 2020/10/12 11:12
 * @Version 1.0
 **/
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}

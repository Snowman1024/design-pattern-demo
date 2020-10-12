package com.snowman.design.pattern.behavioralPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 具体聚合
 * @Author Snowman1024
 * @Date 2020/10/12 11:13
 * @Version 1.0
 **/
public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}

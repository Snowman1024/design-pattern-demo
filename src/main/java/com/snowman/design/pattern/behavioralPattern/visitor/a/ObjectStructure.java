package com.snowman.design.pattern.behavioralPattern.visitor.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 对象结构角色
 * @Author Snowman1024
 * @Date 2020/11/20 10:36
 * @Version 1.0
 **/
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }


    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            i.next().accept(visitor);
        }
    }
}

package com.snowman.design.pattern.structuralPattern.composite.three;

import java.util.ArrayList;

/**
 * @Description 树枝构件：袋子
 * @Author Snowman1024
 * @Date 2020/8/12 11:12
 * @Version 1.0
 **/
public class Bags implements Articles {

    /**
     * 名字
     */
    private String name;

    private ArrayList<Articles> bags = new ArrayList<Articles>();


    public Bags(String name) {
        this.name = name;
    }


    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }


    @Override
    public float calculation() {
        float s = 0;
        for (Articles articles : bags) {
            s += articles.calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
}

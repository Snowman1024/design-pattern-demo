package com.snowman.design.pattern.structuralPattern.composite.one;


/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/8/12 10:58
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();

        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");

        c0.add(leaf1);
        c0.add(c1);

        c1.add(leaf2);
        c1.add(leaf3);

        c0.opertion();
    }
}

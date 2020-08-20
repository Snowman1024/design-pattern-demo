package com.snowman.design.pattern.structuralPattern.composite.two;


/**
 * @Description 树叶组件（无子节点）
 * @Author Snowman1024
 * @Date 2020/8/12 10:49
 * @Version 1.0
 **/
public class Leaf implements Component {

    private String name;

    public Leaf(String name){
        this.name=name;
    }


    @Override
    public void opertion() {
        System.out.println("树叶"+name+"被访问!");
    }
}

package com.snowman.design.pattern.structuralPattern.composite.a;

/**
 * @Description 透明组合模式
 * 抽象组件
 * 实现了所有方法，包含对子节点的操作,树叶必须要实现
 * 但对客户端透明，无需知道是树叶还是树枝
 * @Author Snowman1024
 * @Date 2020/8/12 10:45
 * @Version 1.0
 **/
public interface Component {

    public void add(Component c);

    public void remove(Component c);

    public Component getChild(int i);

    public void opertion();

}

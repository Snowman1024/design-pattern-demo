package com.snowman.design.pattern.structuralPattern.composite.two;

/**
 * @Description 安全组合模式
 * 抽象组件
 * 对子节点的操作,在树枝中实现
 * 对客户端来说，需要知道是树叶还是树枝
 * @Author Snowman1024
 * @Date 2020/8/12 10:45
 * @Version 1.0
 **/
public interface Component {

    public void opertion();

}

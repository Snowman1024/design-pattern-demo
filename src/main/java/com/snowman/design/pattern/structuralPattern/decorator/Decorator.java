package com.snowman.design.pattern.structuralPattern.decorator;

/**
 * @Description 抽象装饰器
 * 实现抽象组件，并保持抽象组件的引用
 * @Author Snowman1024
 * @Date 2020/7/22 15:08
 * @Version 1.0
 **/
public class Decorator implements Componet {

    private Componet componet;

    /**
     * 构造函数
     *
     * @param componet
     */
    public Decorator(Componet componet) {
        this.componet = componet;
    }

    @Override
    public void operation() {
        componet.operation();
        addFunction();
    }

    private void addFunction() {
        System.out.println("抽象装饰器也可以增加额外功能");
    }
}

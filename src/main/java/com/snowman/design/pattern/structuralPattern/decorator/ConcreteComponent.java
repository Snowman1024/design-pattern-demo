package com.snowman.design.pattern.structuralPattern.decorator;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/22 15:04
 * @Version 1.0
 **/
public class ConcreteComponent implements Componet {

    public ConcreteComponent(){
        System.out.println("创建具体构建角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构建角色的方法operation()");
    }
}

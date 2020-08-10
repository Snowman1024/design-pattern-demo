package com.snowman.design.pattern.structuralPattern.decorator;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/22 15:12
 * @Version 1.0
 **/
public class ConcreteDecorator extends Decorator {
    /**
     * 构造函数
     *
     * @param componet
     */
    public ConcreteDecorator(Componet componet) {
        super(componet);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }


    private void addFunction() {
        System.out.println("为具体构建角色增加额外的功能addFunction()");
    }
}

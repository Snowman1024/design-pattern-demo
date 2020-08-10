package com.snowman.design.pattern.structuralPattern.bridge.one;

/**
 * @Description 扩展抽象化角色
 * @Author guoqf
 * @Date 2020/7/31 15:32
 * @Version 1.0
 **/
public class RefinedAbstraction extends Abstraction {


    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }


    @Override
    protected void operation() {
        System.out.println("扩展抽象化角色被访问");
        implementor.operationImpl();
    }
}

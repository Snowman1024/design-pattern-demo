package com.snowman.design.pattern.structuralPattern.facade.two;


/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/8/7 17:36
 * @Version 1.0
 **/
public class Facade1 implements AbstractFacade {

    private SubSystem1 obj1 = new SubSystem1();
    private SubSystem2 obj2 = new SubSystem2();
    private SubSystem3 obj3 = new SubSystem3();

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

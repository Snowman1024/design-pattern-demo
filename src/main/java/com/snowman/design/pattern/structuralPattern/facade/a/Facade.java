package com.snowman.design.pattern.structuralPattern.facade.a;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/8/7 17:34
 * @Version 1.0
 **/
public class Facade {

    private SubSystem1 obj1 = new SubSystem1();
    private SubSystem2 obj2 = new SubSystem2();
    private SubSystem3 obj3 = new SubSystem3();

    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}

package com.snowman.design.pattern.behavioralPattern.templatemethod;

/**
 * @Description 抽象类
 * @Author guoqf
 * @Date 2020/7/23 16:46
 * @Version 1.0
 **/
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod() {
        abstractMethod1();
        hookMethod1();
        if (hookMethod2()) {
            specificMethod();
        }
        abstractMethod2();
    }

    private void specificMethod() {
        System.out.println("抽象类中具体的方法被调用...");
    }


    //钩子方法可以是用于判断的逻辑方法 或 空方法两种

    /**
     * 钩子方法1
     */
    protected void hookMethod1() {
    }

    /**
     * 钩子方法2
     *
     * @return
     */
    protected boolean hookMethod2() {
        return true;
    }

    protected abstract void abstractMethod1();

    protected abstract void abstractMethod2();
}

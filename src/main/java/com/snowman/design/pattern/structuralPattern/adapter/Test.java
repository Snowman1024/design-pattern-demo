package com.snowman.design.pattern.structuralPattern.adapter;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/21 15:34
 * @Version 1.0
 **/
public class Test {

    /**
     * 内部实际上是调用的适配者的方法
     * @param args
     */
    public static void main(String[] args){
        //类模式
        Target target = new ClassAdaper();
        target.request();

        //对象模式
        Adaptee adaptee = new Adaptee();
        Target target2 = new ObjectAdapter(adaptee);
        target2.request();

    }
}

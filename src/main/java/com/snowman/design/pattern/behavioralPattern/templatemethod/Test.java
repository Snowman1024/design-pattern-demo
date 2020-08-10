package com.snowman.design.pattern.behavioralPattern.templatemethod;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/23 16:52
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        AbstractClass a = new ConcreteClass();
        a.templateMethod();
    }
}

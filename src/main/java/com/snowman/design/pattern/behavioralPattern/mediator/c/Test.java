package com.snowman.design.pattern.behavioralPattern.mediator.c;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/24 17:42
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        SimpleColleague c1, c2;
        c1 = new SimpleConcreteColleague1();
        c2 = new SimpleConcreteColleague2();
        c1.send();
        System.out.println("-----------------");
        c2.send();
    }
}

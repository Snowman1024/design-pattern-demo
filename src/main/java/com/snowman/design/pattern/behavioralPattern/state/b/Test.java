package com.snowman.design.pattern.behavioralPattern.state.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/18 17:34
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        ScoreContext sc = new ScoreContext();
        System.out.println("学生成绩状态测试:");
        sc.add(30);
        sc.add(40);
        sc.add(25);
        sc.add(-15);
        sc.add(-25);
        sc.add(20);
    }
}

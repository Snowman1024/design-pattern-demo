package com.snowman.design.pattern.behavioralPattern.memento.two;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/1 10:45
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        You u = new You();
        GirlStack girlStack = new GirlStack();

        String[] nameArr = new String[]{"1王昭君", "2貂蝉", "3西施", "4杨玉环", "5路人甲"};

        for (String name : nameArr) {
            u.setWifeName(name);
            boolean f = girlStack.push(u.createMemento());
            if (f) {
                System.out.println("创建备忘录:" + u.getWifeName() + "成功");
            } else {
                System.out.println("创建备忘录:" + u.getWifeName() + "失败");
            }
        }
        System.out.println("===========后悔了，开始撤销===============");

        for (int i = 0; i < 6; i++) {
            Girl girl = girlStack.pop();
            if (null == girl) {
                System.out.println("没有备忘了无法撤销");
                break;
            } else {
                u.restoreMemento(girl);
                System.out.println("撤销：" + u.getWifeName());
            }

        }

    }
}

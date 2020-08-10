package com.snowman.design.pattern.createPattern.builder;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/29 14:25
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        Builder builder = new ConcreteBuilder1();
        Director d1 = new Director(builder);
        Product p1 = d1.build();
        p1.show();

        Director d2 = new Director(new ConcreteBuilder2());
        Product p2 = d2.build();
        p2.show();


    }

}

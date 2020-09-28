package com.snowman.design.pattern.behavioralPattern.mediator.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/24 17:22
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        //房产中介
        Medium md = new EstateMedium();
        Customer member1, member2;
        member1 = new Seller("张三(卖方)");
        member2 = new Buyer("李四(买方)");
        //客户注册
        md.register(member1);
        md.register(member2);

        member1.send("我有一套房");
        member2.send("有两室一厅的吗？");

    }
}

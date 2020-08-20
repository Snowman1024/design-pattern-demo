package com.snowman.design.pattern.structuralPattern.composite.three;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/8/12 11:15
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Goods sp;

        Bags bigBag = new Bags("大袋子");
        Bags mediumBag = new Bags("中袋子");
        Bags smallRedBag = new Bags("红色小袋子");
        Bags smallWhiteBag = new Bags("白色小袋子");

        sp = new Goods("婺源特产", 2, 7.9f);
        smallRedBag.add(sp);
        sp = new Goods("婺源地图", 1, 9.9f);
        smallRedBag.add(sp);

        sp = new Goods("韶关香菇", 2, 68f);
        smallWhiteBag.add(sp);
        sp = new Goods("韶关红茶", 3, 180f);
        smallWhiteBag.add(sp);


        sp = new Goods("景德镇瓷器", 1, 380f);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);

        sp = new Goods("李宁牌运动鞋", 1, 198f);
        bigBag.add(sp);
        bigBag.add(mediumBag);
        bigBag.add(smallWhiteBag);

        System.out.println("您选购的商品有：");
        bigBag.show();
        float s = bigBag.calculation();
        System.out.println("要支付的总价是：" + s + "元");
    }
}

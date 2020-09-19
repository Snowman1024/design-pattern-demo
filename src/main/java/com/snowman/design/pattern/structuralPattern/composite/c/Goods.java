package com.snowman.design.pattern.structuralPattern.composite.c;

/**
 * @Description 树叶构件：商品
 * @Author Snowman1024
 * @Date 2020/8/12 11:10
 * @Version 1.0
 **/
public class Goods implements Articles {
    /**
     * 名字
     */
    private String name;
    /**
     * 数量
     */
    private int quantity;
    /**
     * 单价
     */
    private float unitPrice;

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }


    @Override
    public float calculation() {
        return quantity * unitPrice;

    }

    @Override
    public void show() {
        System.out.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");
    }
}

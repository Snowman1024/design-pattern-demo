package com.snowman.design.pattern.createPattern.prototype.c;

import java.util.Scanner;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/24 14:17
 * @Version 1.0
 **/
public class Square implements Shape {


    @Override
    public Object clone() {
        Square square = null;
        try {
            square = (Square) super.clone();

        } catch (Exception e) {
            System.out.println("拷贝正方形失败");
        }

        return square;
    }

    @Override
    public void countArea() {
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        System.out.println("该正方形的面积=" + r * r + "\n");
    }


}

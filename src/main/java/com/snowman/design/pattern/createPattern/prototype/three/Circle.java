package com.snowman.design.pattern.createPattern.prototype.three;

import java.util.Scanner;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/24 14:17
 * @Version 1.0
 **/
public class Circle implements Shape {


    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();

        } catch (Exception e) {
            System.out.println("拷贝原型失败");
        }

        return circle;
    }

    @Override
    public void countArea() {
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
    }


}

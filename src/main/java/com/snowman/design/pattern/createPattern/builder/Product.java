package com.snowman.design.pattern.createPattern.builder;

import lombok.Data;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/29 14:16
 * @Version 1.0
 **/
@Data
public class Product {
    private String partA;
    private String partB;
    private String partC;


    public void show(){
        System.out.println(this.toString());
    }
}

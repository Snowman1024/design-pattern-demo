package com.snowman.design.pattern.behavioralPattern.visitor.b;

/**
 * @Description 抽象元素：材料
 * @Author Snowman1024
 * @Date 2020/11/20 11:10
 * @Version 1.0
 **/
public interface Material {

    String accept(Company visitor);
}

package com.snowman.design.pattern.behavioralPattern.visitor.b;

/**
 * @Description 具体元素：纸
 * @Author Snowman1024
 * @Date 2020/11/20 11:13
 * @Version 1.0
 **/
public class Paper implements Material {

    @Override
    public String accept(Company visitor) {
        return visitor.create(this);
    }


}

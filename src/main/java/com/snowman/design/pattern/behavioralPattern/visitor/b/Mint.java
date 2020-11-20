package com.snowman.design.pattern.behavioralPattern.visitor.b;

/**
 * @Description 具体访问者：造币公司
 * @Author Snowman1024
 * @Date 2020/11/20 11:15
 * @Version 1.0
 **/
public class Mint implements Company {
    @Override
    public String create(Paper paper) {
        return "纸币";
    }

    @Override
    public String create(Cuprum cuprum) {
        return "铜币";
    }
}

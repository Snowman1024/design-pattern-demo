package com.snowman.design.pattern.behavioralPattern.visitor.b;

/**
 * @Description 具体访问者：艺术公司
 * @Author Snowman1024
 * @Date 2020/11/20 11:12
 * @Version 1.0
 **/
public class ArtCompany implements Company {


    @Override
    public String create(Paper paper) {
        return "讲学图";
    }

    @Override
    public String create(Cuprum cuprum) {
        return "朱熹铜像";
    }
}

package com.snowman.design.pattern.createPattern.prototype.one;

/**
 * @Description 具体原型
 * @Author guoqf
 * @Date 2020/7/24 11:19
 * @Version 1.0
 **/
public class ConcretePrototype implements Cloneable {

    public ConcretePrototype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (ConcretePrototype) super.clone();
    }
}

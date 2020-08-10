package com.snowman.design.pattern.createPattern.prototype.three;

/**
 * @Description
 * @Author guoqf
 * @Date 2020/7/24 14:36
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        ProtoTypeManager manager = new ProtoTypeManager();
        Shape c = (Circle) manager.getShape("Circle");
        c.countArea();

        Shape s = manager.getShape("Square");
        s.countArea();

    }
}

package com.snowman.design.pattern.createPattern.prototype.three;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/24 14:16
 * @Version 1.0
 **/
public interface Shape extends Cloneable {

    /**
     * 拷贝
     *
     * @return
     */
    public Object clone();

    /**
     * 计算面积
     */
    public void countArea();
}

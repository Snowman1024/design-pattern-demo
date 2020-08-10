package com.snowman.design.pattern.createPattern.prototype.two;

/**
 * @Description 奖状类
 * @Author guoqf
 * @Date 2020/7/24 11:26
 * @Version 1.0
 **/
public class Citation implements Cloneable {

    private String name;
    private String info;
    private String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
    }


    public void diaplay() {
        System.out.println(name + info + college);
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return (Citation) super.clone();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

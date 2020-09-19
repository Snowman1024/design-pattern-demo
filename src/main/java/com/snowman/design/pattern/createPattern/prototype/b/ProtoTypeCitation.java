package com.snowman.design.pattern.createPattern.prototype.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/7/24 13:45
 * @Version 1.0
 **/
public class ProtoTypeCitation {

    public static void main(String[] args) {
        try {
            Citation citation = new Citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院");
            citation.diaplay();

            Citation citation2 = (Citation) citation.clone();
            citation2.setName("李四");
            citation2.diaplay();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

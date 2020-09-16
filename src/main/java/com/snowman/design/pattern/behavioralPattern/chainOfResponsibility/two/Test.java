package com.snowman.design.pattern.behavioralPattern.chainOfResponsibility.two;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/16 11:01
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        //组装责任链
        Leader classAdviser = new ClassAdviser();
        Leader departmentHead = new DepartmentHead();
        Leader dean = new Dean();
        Leader deanOfStudies = new DeanOfStudies();

        classAdviser.setNext(departmentHead);
        departmentHead.setNext(dean);
        dean.setNext(deanOfStudies);

        classAdviser.handlerequest(9);
    }
}

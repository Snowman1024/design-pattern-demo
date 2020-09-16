package com.snowman.design.pattern.behavioralPattern.chainOfResponsibility.one;

/**
 * @Description 具体处理者2
 * @Author Snowman1024
 * @Date 2020/9/9 9:40
 * @Version 1.0
 **/
public class ConcreateHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {

        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理请求");
        } else {
            Handler nextHandler = getNext();
            if (null != nextHandler) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("没有人处理请求");
            }
        }
    }
}

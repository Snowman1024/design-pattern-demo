package com.snowman.design.pattern.behavioralPattern.chainOfResponsibility.a;

import lombok.Data;

/**
 * @Description 抽象处理者角色
 * @Author Snowman1024
 * @Date 2020/9/9 9:38
 * @Version 1.0
 **/
@Data
public abstract class Handler {

    private Handler next;

    /**
     * 处理请求的方法
     * @param request
     */
    public abstract void handleRequest(String request);
}

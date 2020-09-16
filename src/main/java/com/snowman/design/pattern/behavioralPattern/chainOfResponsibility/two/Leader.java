package com.snowman.design.pattern.behavioralPattern.chainOfResponsibility.two;

import lombok.Data;

/**
 * @Description 领导类
 * @Author Snowman1024
 * @Date 2020/9/16 10:53
 * @Version 1.0
 **/
@Data
public abstract class Leader {

    private Leader next;

    public abstract void handlerequest(int leaveDays);
}

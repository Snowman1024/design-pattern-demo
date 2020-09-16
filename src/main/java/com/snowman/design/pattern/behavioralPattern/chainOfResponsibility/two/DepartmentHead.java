package com.snowman.design.pattern.behavioralPattern.chainOfResponsibility.two;

/**
 * @Description 具体处理者：系主任
 * @Author Snowman1024
 * @Date 2020/9/16 10:59
 * @Version 1.0
 **/
public class DepartmentHead extends Leader {
    @Override
    public void handlerequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("系主任批准你请假" + leaveDays + "天");
        } else {
            Leader nextLeader = getNext();
            if (null != nextLeader) {
                nextLeader.handlerequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没人能批准");
            }
        }
    }
}

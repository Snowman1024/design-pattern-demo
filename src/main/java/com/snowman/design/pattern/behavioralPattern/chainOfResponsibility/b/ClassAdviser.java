package com.snowman.design.pattern.behavioralPattern.chainOfResponsibility.b;

/**
 * @Description 具体处理者：班主任
 * @Author Snowman1024
 * @Date 2020/9/16 10:55
 * @Version 1.0
 **/
public class ClassAdviser extends Leader {


    @Override
    public void handlerequest(int leaveDays) {
        if (leaveDays <= 2) {
            System.out.println("班主任批准你请假" + leaveDays + "天");
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

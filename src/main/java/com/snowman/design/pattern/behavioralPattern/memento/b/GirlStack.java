package com.snowman.design.pattern.behavioralPattern.memento.b;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 管理者
 * @Author Snowman1024
 * @Date 2020/9/1 10:38
 * @Version 1.0
 **/
public class GirlStack {

    private List<Girl> girlList = new ArrayList<>();
    private int maxCount = 4;


    public boolean push(Girl g) {
        if (girlList.size() >= maxCount) {
            System.out.println("美女栈满了，放不进去了");
            return false;
        } else {
            girlList.add(g);
            return true;
        }
    }

    public Girl pop() {
        Girl girl = null;
        if (girlList.size() <= 0) {
            System.out.println("美女栈空了");
        } else {
            girl = girlList.get(girlList.size() - 1);
            girlList.remove(girlList.size() - 1);
            return girl;
        }
        return girl;
    }
}

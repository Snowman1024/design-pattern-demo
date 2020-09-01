package com.snowman.design.pattern.behavioralPattern.memento.two;

import lombok.Data;

/**
 * @Description 发起人
 * @Author guoqf
 * @Date 2020/9/1 10:35
 * @Version 1.0
 **/
@Data
public class You {

    private String wifeName;

    public Girl createMemento(){
        return new Girl(wifeName);
    }

    public void restoreMemento(Girl girl){
        setWifeName(girl.getName());
    }


}

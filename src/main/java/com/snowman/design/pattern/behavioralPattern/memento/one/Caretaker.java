package com.snowman.design.pattern.behavioralPattern.memento.one;

import lombok.Data;

/**
 * @Description 管理者(保存和获取备忘录，不能修改备忘录内容)
 * @Author guoqf
 * @Date 2020/9/1 10:24
 * @Version 1.0
 **/
@Data
public class Caretaker {

    private Memento memento;


}

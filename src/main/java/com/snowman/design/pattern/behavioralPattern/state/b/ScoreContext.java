package com.snowman.design.pattern.behavioralPattern.state.b;

import lombok.Data;

/**
 * @Description 环境类
 * @Author Snowman1024
 * @Date 2020/9/16 15:45
 * @Version 1.0
 **/
@Data
public class ScoreContext {

    private AbstractState state;

    /**
     * 定义环境类 初始状态
     */
    public ScoreContext() {
        state = new LowState(this);
    }

    /**
     * 对请求做处理
     */
    public void add(int score) {
        state.addScore(score);
    }

}

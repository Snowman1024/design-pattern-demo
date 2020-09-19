package com.snowman.design.pattern.behavioralPattern.state.d;

import java.util.HashMap;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/19 15:28
 * @Version 1.0
 **/
public class ShareContext {

    private ShareState state;

    private HashMap<String, ShareState> stateSet = new HashMap<String, ShareState>();

    public ShareContext() {
        state = new ConcreteState1();
        stateSet.put("1", state);

        state = new ConcreteState2();
        stateSet.put("2", state);

        state = getState("1");
    }

    /**
     * 设置新状态
     *
     * @param state
     */
    public void setState(ShareState state) {
        this.state = state;
    }

    /**
     * 读取状态
     *
     * @param key
     * @return
     */
    public ShareState getState(String key) {
        ShareState s = (ShareState) stateSet.get(key);
        return s;
    }

    /**
     * 对请求做处理
     */
    public void handle() {
        state.handle(this);
    }
}

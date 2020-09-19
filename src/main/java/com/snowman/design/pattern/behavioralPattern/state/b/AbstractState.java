package com.snowman.design.pattern.behavioralPattern.state.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/9/16 15:42
 * @Version 1.0
 **/
public abstract class AbstractState {


    protected ScoreContext context;
    /**
     * 状态名
     */
    protected String stateName;
    /**
     * 分数
     */
    protected int score;

    /**
     * 检查当前状态
     */
    public abstract void checkState();


    /**
     * @param s
     */
    public void addScore(int s) {
        score += s;
        System.out.print("加上:" + s + "分，\t当前分数:" + score);
        checkState();
        System.out.println("分，\t当前状态:" + context.getState().stateName);
    }


}

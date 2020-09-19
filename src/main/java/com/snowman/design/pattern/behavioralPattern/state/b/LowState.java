package com.snowman.design.pattern.behavioralPattern.state.b;

/**
 * @Description 具体状态：不及格
 * @Author Snowman1024
 * @Date 2020/9/18 17:21
 * @Version 1.0
 **/
public class LowState extends AbstractState {


    public LowState(ScoreContext c) {
        context = c;
        stateName = "不及格";
        score = 0;
    }

    public LowState(ScoreContext context, int score) {
        this.context = context;
        stateName = "不及格";
        this.score = score;
    }

    @Override
    public void checkState() {

        if (score >= 90) {
            context.setState(new HighState(context, score));
        } else if (score >= 60) {
            context.setState(new MiddleState(context, score));
        }
    }
}

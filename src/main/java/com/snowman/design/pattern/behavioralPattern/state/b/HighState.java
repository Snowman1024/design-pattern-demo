package com.snowman.design.pattern.behavioralPattern.state.b;

/**
 * @Description 具体状态：中等
 * @Author Snowman1024
 * @Date 2020/9/18 17:21
 * @Version 1.0
 **/
public class HighState extends AbstractState {


    public HighState(ScoreContext context, int score) {
        this.context = context;
        this.stateName = "优秀";
        this.score = score;
    }


    @Override
    public void checkState() {

        if (score < 60) {
            context.setState(new LowState(context, score));
        } else if (score < 90) {
            context.setState(new MiddleState(context, score));
        }
    }
}

package com.snowman.design.pattern.behavioralPattern.state.b;

/**
 * @Description 具体状态：中等
 * @Author Snowman1024
 * @Date 2020/9/18 17:21
 * @Version 1.0
 **/
public class MiddleState extends AbstractState {


    public MiddleState(ScoreContext context, int score) {
        this.context = context;
        stateName = "中等";
        this.score = score;
    }


    @Override
    public void checkState() {

        if (score < 60) {
            context.setState(new LowState(context, score));
        } else if (score >= 90) {
            context.setState(new HighState(context, score));
        }
    }
}

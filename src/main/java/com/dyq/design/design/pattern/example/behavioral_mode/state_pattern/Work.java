package com.dyq.design.design.pattern.example.behavioral_mode.state_pattern;

public class Work {

    /**
     * 时间
     */
    private int hour;
    /**
     * 相应时间的工作状态
     */
    private State state;
    /**
     * 工作是否完成标识
     */
    private boolean workFinished = false;
    
    public Work() {
        hour = 8;
        state = new MorningWorkState();
    }
    
    public void getWorkState(){
        state.workState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isWorkFinished() {
        return workFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        this.workFinished = workFinished;
    }
    
}

package com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern;

/**
 * 请假
 */
public class LeaveNode {

    /**
     * 请假天数
     */
    private  int number;

    /**
     * 请假人
     */
    private String person;
    public LeaveNode(String person,int number){
        this.person = person;
        this.number = number;
    } 
    public int getNumber() {
        return number;
    } 
    public void setNumber(int number) {
        this.number = number;
    } 
    public String getPerson() {
        return person;
    } 
    public void setPerson(String person) {
        this.person = person;
    }
}

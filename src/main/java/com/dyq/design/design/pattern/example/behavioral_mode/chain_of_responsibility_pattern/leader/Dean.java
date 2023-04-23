package com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern.leader;


import com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern.LeaveNode;

/**
 * 院长
 */
public class Dean extends Leader{
	 
    public Dean(String name) {
        super(name);
    }
 
    @Override
    public void handleRequest(LeaveNode LeaveNode) {
        if(LeaveNode.getNumber() <= 10){   //小于10天院长审批
            System.out.println(name + "审批" +LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        }
        else{     //否则传递给校长
            if(this.successor != null){
                this.successor.handleRequest(LeaveNode);
            }
        }
    }
 
}
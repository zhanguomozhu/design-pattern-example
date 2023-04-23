package com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern.leader;


import com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern.LeaveNode;

/**
 * 辅导员
 */
public class Instructor extends Leader{
	 
    public Instructor(String name){
        super(name);
    }
    
    @Override
    public void handleRequest(LeaveNode LeaveNode) {
        if(LeaveNode.getNumber() <= 3){   //小于3天辅导员审批
            System.out.println(name + "审批" +LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        }
        else{     //否则传递给系主任
            if(this.successor != null){
                this.successor.handleRequest(LeaveNode);
            }
        }
    }
 
}
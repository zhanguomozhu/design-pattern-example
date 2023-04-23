package com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern.leader;


import com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern.LeaveNode;

/**
 * 校长
 */
public class President extends Leader{
	 
    public President(String name) {
        super(name);
    }
 
    @Override
    public void handleRequest(LeaveNode LeaveNode) {
        if(LeaveNode.getNumber() <= 15){   //小于15天校长长审批
            System.out.println(name + "审批" +LeaveNode.getPerson() + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        }
        else{     //否则不允批准
            System.out.println(LeaveNode.getPerson()+"同学"+"请假天天超过15天,不批准...");
        }
    }
 
}
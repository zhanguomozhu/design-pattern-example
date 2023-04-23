package com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern.leader;

import com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern.LeaveNode;

public abstract class Leader {

    /**
     * 姓名
     */
    public String name;

    /**
     * 后继者
     */
    protected Leader successor;
    public Leader(String name){
        this.name = name;
    }
 
    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }
    
    public abstract void handleRequest(LeaveNode LeaveNode);
}
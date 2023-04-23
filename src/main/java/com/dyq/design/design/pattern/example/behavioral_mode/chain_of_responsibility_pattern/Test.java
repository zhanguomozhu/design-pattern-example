package com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern;


import com.dyq.design.design.pattern.example.behavioral_mode.chain_of_responsibility_pattern.leader.*;

/**
 * 责任链模式
 * Chain of Responsibility模式适用于以下条件：
 * • 有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
 * • 想在不明确指定接收者的情况下向多个对象中的一个提交一个请求。
 * • 可处理一个请求的对象集合应被动态指定。
 *
 * 举例：
 * 学校规定参加校招的同学必须要请假，且要有相关人员的签字，三天以下需辅导员签字、三到七天需要系主任签字，
 * 一个星期以上需要院长签字，更多的则需要校长签字！
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader instructor = new Instructor("刘辅导员");
		Leader departmentHead = new DepartmentHead("王主任");
		Leader dean = new Dean("张院长");
		Leader president = new President("李校长");


		//辅导员的后续者是系主任
		instructor.setSuccessor(departmentHead);
		//系主任的后续者是院长
		departmentHead.setSuccessor(dean);
		//院长的后续者是校长
		dean.setSuccessor(president);



		//请假3天的请假条
		LeaveNode leaveNode1 = new LeaveNode("张三", 3);
		instructor.handleRequest(leaveNode1);     		        
		//请假5天的请假条
		LeaveNode leaveNode2 = new LeaveNode("李四", 5);
		instructor.handleRequest(leaveNode2);      
		//请假9天的请假条
		LeaveNode leaveNode3 = new LeaveNode("王五", 9);
		instructor.handleRequest(leaveNode3);		        
		//请假12天的请假条
		LeaveNode leaveNode4 = new LeaveNode("赵六", 12);
		instructor.handleRequest(leaveNode4);
		//请假18天的请假条
		LeaveNode leaveNode5 = new LeaveNode("孙七", 18);
		instructor.handleRequest(leaveNode5);		
	}
}

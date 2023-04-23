package com.dyq.design.design.pattern.example.mediator_pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User robert = new User("Robert");
	    User john = new User("John");	 
	    robert.sendMessage("Hi! John!");
	    john.sendMessage("Hello! Robert!");
	}

}

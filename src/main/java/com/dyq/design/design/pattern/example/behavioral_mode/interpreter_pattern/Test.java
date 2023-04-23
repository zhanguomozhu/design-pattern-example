package com.dyq.design.design.pattern.example.behavioral_mode.interpreter_pattern;

import com.dyq.design.design.pattern.example.behavioral_mode.interpreter_pattern.expression.AndExpression;
import com.dyq.design.design.pattern.example.behavioral_mode.interpreter_pattern.expression.Expression;
import com.dyq.design.design.pattern.example.behavioral_mode.interpreter_pattern.expression.OrExpression;
import com.dyq.design.design.pattern.example.behavioral_mode.interpreter_pattern.expression.TerminalExpression;

public class Test {
	/**
	 * 规则：Robert 和 John 是男性
	 * @return
	 */
	public static Expression getMaleExpression(){
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	/**
	 * 规则：Julie 是一个已婚的女性
	 * @return
	 */
	public static Expression getMarriedWomanExpression(){
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
		System.out.println("Julie is male? " + isMale.interpret("Julie"));
		System.out.println("Julie is a single women? " + isMarriedWoman.interpret("single Julie"));
	}

}

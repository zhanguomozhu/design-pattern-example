package com.dyq.design.design.pattern.example.behavioral_mode.template_pattern;

/**
 * 模板方法模式
 * 模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * 举例：
 * 现在有很多体育运动都是计时运动，比如篮球、足球等，都需要在比赛开始时计时，等时间到后停止比赛，但是中间的比赛方式各不相同。展示每种比赛的流程就可以用模板模式来实现。
 */
public class Test {

	public static void main(String[] args) {
		Sports sports = new Basketball();
        sports.play();
        System.out.println("=== another sport game ===");
        sports = new Football();
        sports.play();
	}

}

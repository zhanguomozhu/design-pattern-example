package com.dyq.design.design.pattern.example.behavioral_mode.state_pattern;

/**
 * 状态模式
 * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况。把状态的判断逻辑转移到表示不同状态的一系列当中，
 * 可以把复杂的判断逻辑简化。当然，如果这个状态判断很简单，那就没必要使用“状态模式”了。
 *
 * 举例：
 * 在公司工作工作一天，每个阶段的工作状态都不同，比如上午会比较精神，中午困了需要休息，下午休息完后又有精神了，
 * 但是到了晚上如果加班很晚，就会很累，加班到凌晨可能就会在单位休息了。由于判断比较多，就可以用状态模式来实现。
 */
public class Test {
	
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(8);
        work.getWorkState();
        
        work.setHour(10);
        work.getWorkState();
        
        work.setHour(12);
        work.getWorkState();
        
        work.setHour(13);
        work.getWorkState();
        
        work.setHour(14);
        work.getWorkState();
        
        work.setHour(17);
        work.getWorkState();
        
        work.setHour(19);
        work.getWorkState();
        
        work.setWorkFinished(true);

        work.setHour(22);
        work.getWorkState();
        
    }
    
}

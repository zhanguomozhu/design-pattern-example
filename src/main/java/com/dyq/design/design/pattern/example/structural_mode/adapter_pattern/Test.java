package com.dyq.design.design.pattern.example.structural_mode.adapter_pattern;

/**
 * 适配器模式
 * 适配器模式（Adapter），将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
 * 在软件开发中，系统的数据和行为都正确，但接口不符时，我们应该考虑用适配器，目的是使控制范围之外的一个原有对象与某个接口匹配。
 * 适配器模式主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致的情况。
 *
 * 举例：
 * 姚明刚进入NBA时，英语不好，听不懂教练的安排，由于NBA大部分都是美国选手，因此不能要求教练用中文，所以需要一个翻译来讲教练的
 * 指挥翻译成中文。这个翻译就相当于是一个适配器，外籍选手就是需要适配的类，懂英语的选手是目标所期待的类。
 */
public class Test {

    public static void main(String[] args) {
        Player playerA = new ForwardPlayer("安东尼");
        Player playerB = new GuardPlayer("科比");
        playerA.attack();
        playerB.defense();
        
        Player playerC = new Translator("姚明");
        playerC.attack();
        playerC.defense();
    }

}

package com.dyq.design.design.pattern.example.creation_mode.builder_pattern;

/**
 * 建造者模式
 * 建造者模式（Builder），将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * 使用建造者模式的情景：
 * 主要是用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但对象内部的构建通常面临着复杂的变化。
 *
 * 建造者模式的好处就是使得建造代码与表示代码分离，由于建造者隐藏了该产品是如何组装的，所以若需要改变一个产品的内部表示，只需要再定义一个具体的建造者就可以了。
 *
 * 举例：
 * 当玩一个角色扮演类的游戏时，通常都需要创建一个角色，可以选择男性或女性，生成人物的打扮和武器也会根据选择的性别发生变化，
 * 但是男性和女性单独创建的流程都是固定不变的，即所有男性的打扮、武器都是固定的，这个生成角色的过程就可以用建造者模式实现。代码如下：
 */
public class Test1 {
	
    public static void main(String[] args) {
    	
        // 创建一个男性角色
        BuildMan man = new BuildMan();
        man.buildSex();
        man.buildCloth();
        man.buildWeapon();
        Person person1 = man.createPerson();
        System.out.println(person1.show());

        System.out.println("============");

        BuildWomen woman = new BuildWomen();
        woman.buildSex();
        woman.buildCloth();
        woman.buildWeapon();
        Person person2 = woman.createPerson();
        System.out.println(person2.show());
        
    }
    
}

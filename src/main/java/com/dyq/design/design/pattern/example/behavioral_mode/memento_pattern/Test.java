package com.dyq.design.design.pattern.example.behavioral_mode.memento_pattern;


/**
 * 备忘录模式
 * 备忘录（Memento），在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可以将该对象恢复到原先保存的状态。
 *
 * 举例：
 * 比如玩单机游戏，一般打大boss前，或者需要下线了，都会把当前的状态保存一份，避免打boss死亡或者角色数据丢失，这个就可以用备忘录模式来实现。
 */
public class Test {

    public static void main(String[] args) {
        Player player = new Player();
        player.show();
        // 保存状态
        RoleAdmin roleAdmin = new RoleAdmin();
        roleAdmin.setRoleStateMemento(player.saveState());
        // 开始战斗
        player.fight();
        player.show();
        // 状态不好了，恢复到战斗前的状态
        player.RecoveryState(roleAdmin.getRoleStateMemento());
        player.show();
    }

}

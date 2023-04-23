package com.dyq.design.design.pattern.example.behavioral_mode.memento_pattern;

import java.util.Random;


/**
 * 游戏角色类
 */
public class Player {

    /**
     * 生命力
     */
    private int vit = 100;

    /**
     * 攻击力
     */
    private int atk = 100;

    /**
     * 防御力
     */
    private int def = 100;

    /**
     * 保存角色状态
     * @return
     */
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit, atk, def);
    }

    /**
     * 恢复角色
     * @param backup
     */
    public void RecoveryState(RoleStateMemento backup){
        this.vit = backup.getVit();
        this.atk = backup.getAtk();
        this.def = backup.getDef();
    }

    /**
     * 战斗
     */
    public void fight(){
        Random random = new Random();
        this.vit = random.nextInt(99);
        this.atk = random.nextInt(99);
        this.def = random.nextInt(99);
    }

    /**
     * 展示属性
     */
    public void show(){
        System.out.println("生命力：" + vit + " 攻击力：" + atk + " 防御力：" + def);
    }
    
    public int getVit() {
        return vit;
    }
    
    public void setVit(int vit) {
        this.vit = vit;
    }
    
    public int getAtk() {
        return atk;
    }
    
    public void setAtk(int atk) {
        this.atk = atk;
    }
    
    public int getDef() {
        return def;
    }
    
    public void setDef(int def) {
        this.def = def;
    }
    
}

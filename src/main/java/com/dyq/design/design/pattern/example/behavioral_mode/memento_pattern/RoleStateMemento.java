package com.dyq.design.design.pattern.example.behavioral_mode.memento_pattern;


/**
 * 游戏备忘录类，记录需要存档的数据信息
 */
public class RoleStateMemento {

    /**
     * 生命力
     */
    private int vit;

    /**
     * 攻击力
     */
    private int atk;

    /**
     * 防御力
     */
    private int def;
    
    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }
    
    public int getVit() {
        return vit;
    }
    
    public int getAtk() {
        return atk;
    }
    
    public int getDef() {
        return def;
    }
    
}

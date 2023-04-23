package com.dyq.design.design.pattern.example.behavioral_mode.memento_pattern;


/**
 * 角色状态管理者
 */
public class RoleAdmin {
	
    private RoleStateMemento roleStateMemento;
    
    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }
    
    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
    
}

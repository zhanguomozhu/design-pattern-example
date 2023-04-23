package com.dyq.design.design.pattern.example.structural_mode.proxy_pattern;

/**
 * RealSubject类-MySQLUserKatrina、OracleUserKatrina
 */
public class MySQLUserKatrina implements IUserKatrina {

	@Override
	public void add() {
		System.out.println("MySQL添加用户");
	}

	@Override
	public void del() {
		System.out.println("MySQL删除用户");
	}

}

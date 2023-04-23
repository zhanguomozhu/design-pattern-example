package com.dyq.design.design.pattern.example.structural_mode.proxy_pattern;

/**
 * RealSubject类-MySQLUserKatrina、OracleUserKatrina
 */
public class OracleUserKatrina implements IUserKatrina {

	@Override
	public void add() {
		System.out.println("Oracle添加用户");
	}

	@Override
	public void del() {
		System.out.println("Oracle删除用户");
	}

}

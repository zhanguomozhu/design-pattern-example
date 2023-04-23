package com.dyq.design.design.pattern.example.structural_mode.proxy_pattern;

/**
 * Proxy类-ProxyKatrina
 */
public class ProxyKatrina implements IUserKatrina {

	private IUserKatrina iUserKatrina;
	
	public ProxyKatrina(IUserKatrina iUserKatrina) {
		this.iUserKatrina = iUserKatrina;
	}

	@Override
	public void add() {
		if (iUserKatrina != null) {
			iUserKatrina.add();
		}
	}

	@Override
	public void del() {
		if (iUserKatrina != null) {
			iUserKatrina.del();
		}
	}

}

package com.dyq.design.design.pattern.example.behavioral_mode.visitor_pattern;


/**
 * 图书文献接口
 */
public interface LibraryItemInterface {

	/**
	 * 查看对象
	 * @param visitor
	 */
	void accept(LibraryVisitor visitor);

	/**
	 * 书名
	 * @return
	 */
	public String getName();

	/**
	 * 作者
	 * @return
	 */
	public String getAuthor();
}

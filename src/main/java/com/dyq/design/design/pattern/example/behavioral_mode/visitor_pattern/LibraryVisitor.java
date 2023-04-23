package com.dyq.design.design.pattern.example.behavioral_mode.visitor_pattern;


/**
 * 图书馆访问者接口
 */
public interface LibraryVisitor {

	/**
	 * 访问书籍
	 * @param p_book
	 */
	void visit(Book p_book);

	/**
	 * 访问论文
	 * @param p_article
	 */
	void visit(Article p_article);

	/**
	 * 打印页数
	 */
	void printSum();
}

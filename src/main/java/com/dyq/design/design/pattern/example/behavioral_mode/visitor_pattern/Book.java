package com.dyq.design.design.pattern.example.behavioral_mode.visitor_pattern;


/**
 * 书籍
 */
public class Book implements LibraryItemInterface {

	/**
	 * 书名
	 */
	private String m_title;

	/**
	 * 书作者
	 */
	private String m_author;

	/**
	 * 页教
	 */
	private int m_pages;
	public Book(String p_author, String p_title,int p_pages) {
		m_title = p_title;
		m_author = p_author;
		m_pages = p_pages;
	}
	public int getNumberOfPages() {
		return m_pages;
	}
	@Override
	public void accept(LibraryVisitor visitor) {
		visitor.visit(this);
	}
	@Override
	public String getName() {
		return m_title;
	}
	@Override
	public String getAuthor() {
		return m_author;
	}
}

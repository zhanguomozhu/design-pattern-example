package com.dyq.design.design.pattern.example.behavioral_mode.visitor_pattern;


/**
 * 论文
 */
public class Article implements LibraryItemInterface {

	/**
	 * 论文名
	 */
	private String m_title;

	/**
	 * 论文作者
	 */
	private String m_author;
	private int m_start_page;
	private int m_end_page;
	public Article(String p_author, String p_title, int p_start_page, int p_end_page) {
		m_title = p_title;
		m_author = p_author;
		m_start_page = p_start_page;
		m_end_page = p_end_page;
	}

	public int getNumberOfPages() {
		return m_end_page - m_start_page;
	}


	/**
	 * 查看对象
	 * @param visitor
	 */
	@Override
	public void accept(LibraryVisitor visitor) {
		visitor.visit(this); ;
	}


	/**
	 * 书名
	 * @return
	 */
	@Override
	public String getName() {
		return m_title;
	}

	/**
	 * 作者
	 * @return
	 */
	@Override
	public String getAuthor() {
		return m_author;
	}
}


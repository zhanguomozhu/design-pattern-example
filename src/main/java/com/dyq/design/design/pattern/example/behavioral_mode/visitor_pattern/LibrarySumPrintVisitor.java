package com.dyq.design.design.pattern.example.behavioral_mode.visitor_pattern;


/**
 * 图书馆总页数打印访问者
 */
public class LibrarySumPrintVisitor implements LibraryVisitor { // 打印总页数
	private int sum = 0;

	@Override
	public void visit(Book p_book) {
		sum = sum + p_book.getNumberOfPages();
		System.out.println("访问了：" + p_book.getName() + "  作者：" + p_book.getAuthor()
		+ "  页数：" +p_book.getNumberOfPages() + "页");
	}
	@Override
	public void visit(Article p_article) {
		sum = sum + p_article.getNumberOfPages();
		System.out.println("访问了：" + p_article.getName() + "  作者：" + p_article.getAuthor()
		+ "  页数：" + p_article.getNumberOfPages() + "页");
	}
	@Override
	public void printSum() {
		System.out.println("统计总页数：SUM = " + sum + "页");
	}
}

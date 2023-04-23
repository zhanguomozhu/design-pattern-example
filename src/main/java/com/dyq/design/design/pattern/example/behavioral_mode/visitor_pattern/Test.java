package com.dyq.design.design.pattern.example.behavioral_mode.visitor_pattern;


/**
 * 访问者模式
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryItemInterface book = new Book("储华","软件设计师教程",540); 
		LibraryItemInterface article1 = new Article("张三","关于人工智能...",1,26); 
		LibraryItemInterface article2 = new Article("李四","关于计算机系统结构...",27,52); 
		LibraryVisitor libraryVisitor = new LibrarySumPrintVisitor();
		book.accept(libraryVisitor);
		article1.accept(libraryVisitor);
		article2.accept(libraryVisitor);
		libraryVisitor.printSum();
	}

}

package com.book.part1.chapter1.test;

import com.book.part1.chapter1.demo.Book;
import com.book.part1.chapter1.demo.BookShelf;
import com.book.part1.chapter1.demo.Iterator;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午4:28:14 
**************************************************/
public class MainDemo {
    public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("ABC杀人事件"));
		bookShelf.appendBook(new Book("时间简史"));
		bookShelf.appendBook(new Book("人类简史"));
		bookShelf.appendBook(new Book("JAVA核心思想"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}

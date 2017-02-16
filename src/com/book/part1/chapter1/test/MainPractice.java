package com.book.part1.chapter1.test;

import com.book.part1.chapter1.practice.Book;
import com.book.part1.chapter1.practice.BookShelf;
import com.book.part1.chapter1.practice.Iterator;

/************************************************
    * Description: 
    *      
    *      这个是用ArrayList存储的book  并没有改动遍历的逻辑 
    *      这就是iterator模式的作用
    *      
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午5:09:04 
**************************************************/
public class MainPractice {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
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

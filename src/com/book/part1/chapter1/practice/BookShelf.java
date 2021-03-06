package com.book.part1.chapter1.practice;

import java.util.ArrayList;
import java.util.List;

/************************************************
    * Description:   
    * 
    *  专注于存储书籍  
    *  
    *  关键点  数组需要初始化
    * 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午4:13:18 
**************************************************/
public class BookShelf implements Aggregate{
//    private Book[] books;
	private List<Book> books;
    
    public BookShelf(){
    	books = new ArrayList<Book>();
    }
    
    public Book getBookAt(int i){
    	return books.get(i);
    }
    
    public int getLength(){
    	return books.size();   
    }
    
    public void appendBook(Book book){
        this.books.add(book);
    }
    
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
	
}

package com.book.part1.chapter1.demo;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午4:48:45 
**************************************************/
public class BookShelf implements Aggregate {
   
	private Book[] books;
	private int last;
	
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}
	
	public Book getBookAt(int i){
		return books[i];
	}
	
	public void appendBook(Book book){
		books[last++] = book;
	}
	
	public int getLength(){
		return last;
	}
	
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}

}

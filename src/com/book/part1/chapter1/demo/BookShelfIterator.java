package com.book.part1.chapter1.demo;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午4:53:20 
**************************************************/
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index =0;
	
	
	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf = bookShelf;
	}
	
	@Override
	public boolean hasNext() {
		return index!=bookShelf.getLength();
	}

	@Override
	public Object next() {
		return bookShelf.getBookAt(index++);
	}

}

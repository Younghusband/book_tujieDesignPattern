package com.book.part3.chapter5.demo;
/**
 * @description 
 *          
 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，
 而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊，不过，个人认为由于1.5中才加入enum特性
 * 
 * @author vermouth.Mac
 * @version 2017年2月18日 下午3:08:12
 */

public enum SingletonEnum {
	INSTANCE;
	public void whatevermethod(){
		//然而这样写  我不会用啊
	}
       
}

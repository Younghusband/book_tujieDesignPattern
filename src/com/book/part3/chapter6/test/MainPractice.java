package com.book.part3.chapter6.test;

import com.book.part3.chapter6.practice.MessageBox;
import com.book.part3.chapter6.practice.UnderlinePen;
import com.book.part3.chapter6.practice.framework.Manager;
import com.book.part3.chapter6.practice.framework.Product;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月21日 上午10:48:50 
**************************************************/
public class MainPractice {
	public static void main(String[] args) {
		Manager manager = new Manager();
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		UnderlinePen upen = new UnderlinePen('~');
		
		manager.register("strong message", mbox);
		manager.register("warning box", sbox);
		manager.register("slash box", upen);
		//--- 以上创建原型  以及存储对象完毕  
		
		//--  接下来复制使用对象
		Product p1 = manager.create("strong message");  //获得mbox
		Product p2 = manager.create("warning box");  //获得sbox
		Product p3 = manager.create("slash box"); //获得upen
		p1.use("Hello World.");
		p2.use("Hello World.");
		p3.use("Hello World.");
		
	}
}

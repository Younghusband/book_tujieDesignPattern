package com.book.part3.chapter6.demo;

import com.book.part3.chapter6.demo.famework.Product;

/************************************************
 * Description:
 * 
 * @author Vermouth.yf
 * @version 1.0
 * @date ：2017年2月20日 下午5:39:52
 **************************************************/
public class UnderlinePen implements Product {
	private char ulchar;

	public UnderlinePen(char x) {
		this.ulchar = x;
	}

	@Override
	public void use(String s) {
        System.out.println("\""+s+"\""); // "s"
        System.out.print(" ");
        for(int i=1;i<=s.length();i++){
        	System.out.print(this.ulchar);
        }
        System.out.print(" ");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}

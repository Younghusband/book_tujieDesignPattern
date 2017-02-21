package com.book.part3.chapter6.demo;

import com.book.part3.chapter6.demo.famework.Product;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月20日 下午5:39:39 
**************************************************/
public class MessageBox implements Product{
    private char decochar;
    public MessageBox(char x){
    	this.decochar = x;
    }
	
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		for(int i=1;i<=s.length()+4;i++){
			System.out.print(this.decochar);
		}System.out.println();
		System.out.println(this.decochar+" "+s+" "+this.decochar);
		for(int i=1;i<=s.length()+4;i++){
			System.out.print(this.decochar);
		}System.out.println();
	}

	@Override
	public Product createClone() {
		// TODO Auto-generated method stub
		Product p = null;
		try {
			p = (Product)clone();   //为什么这样写呢？ 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
   
}

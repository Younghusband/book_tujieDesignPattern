package com.book.part3.chapter6.practice;

import com.book.part3.chapter6.practice.framework.Product;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月21日 上午10:47:12 
**************************************************/
public class MessageBox extends Product {
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

}

package com.book.part3.chapter6.practice.framework;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月21日 上午10:37:57 
**************************************************/
public abstract class Product implements Cloneable{
     public abstract void use(String s);
     
     public Product createClone(){
    	 Product p = null;
    	 try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return p;
     }
}

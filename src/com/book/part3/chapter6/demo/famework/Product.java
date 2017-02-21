package com.book.part3.chapter6.demo.famework;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月20日 下午5:40:44 
**************************************************/
public interface Product extends Cloneable {  // interface Product extends interface Clonable
    public void use(String s);
    public Product createClone();
}

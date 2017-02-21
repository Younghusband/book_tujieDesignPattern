package com.book.part3.chapter7.demo;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月21日 上午11:41:31 
**************************************************/
public abstract class Builder {   //这里既然都是抽象方法  为啥不用接口
   public abstract void makeTitle(String s);
   public abstract void makeString(String s);
   public abstract void makeItems(String [] items);
   public abstract void close();
}

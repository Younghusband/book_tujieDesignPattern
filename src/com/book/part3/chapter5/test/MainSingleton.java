package com.book.part3.chapter5.test;

import com.book.part3.chapter5.demo.*;

/**
 * @description 
 * @author vermouth.Mac
 * @version 2017年2月18日 下午1:11:47
 */

public class MainSingleton {
      public static void main(String[] args) {
		//-----------测试最基本的饿汉式 Singleton1
    	  Singleton1 s1 = Singleton1.getInstance();
    	  Singleton1 s2 = Singleton1.getInstance();
    	  
    	  if(s1==s2){
    		  System.out.println("单例模式成功！ s1和s2是同一个对象");
    	  }else
    		  throw new RuntimeException("单例模式失败！");
    	  
    	 //----------测试饱汉式
    	  
    	  
	}
}

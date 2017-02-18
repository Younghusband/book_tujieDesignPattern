package com.book.part3.chapter5.test;

import com.book.part3.chapter5.demo.Singleton2;

/**
 * @description 
 *      用多线程测试无锁懒汉式漏洞
 * @author vermouth.Mac
 * @version 2017年2月18日 下午3:55:45
 */

public class MainThread extends Thread{
      public static void main(String[] args) {
		System.out.println("Start.");
		new MainThread("A").start();
		new MainThread("B").start();
		new MainThread("C").start();
		System.out.println("End.");
	}
      public void run(){
    	  Singleton2 obj = Singleton2.getInstance();
    	  System.out.println(getName()+": obj"+obj);
      }
      public MainThread(String name){
    	  super(name);  //这个super给谁的？ Object ? Thread ?
      }
}

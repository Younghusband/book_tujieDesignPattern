package com.book.part3.chapter5.demo;
/**
 * @description 
 *         懒汉式  书中并没有写出来  自己写在这里
 *         这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步。
 *         
 *         这里故意增大对象创建间隔 给别的线程可乘之机 用来暴露缺陷
 *         
 * @author vermouth.Mac
 * @version 2017年2月18日 下午1:14:06
 */

public class Singleton2 {
      private static Singleton2 singleton;
      private Singleton2(){
    	  System.out.println("生成了一个实例。");
    	  slowdown();
      }
      public static /*synchronized */ Singleton2 getInstance(){   // synchronized 和 static都是方法修饰符 谁前谁后无所谓
    	  if(singleton==null){
    		  singleton = new Singleton2();
    	  }
    	  return singleton;
      }
      
      private void slowdown(){
    	  try{
    		  Thread.sleep(1000);
    	  }catch(InterruptedException e){
    		  
    	  }
      }
}

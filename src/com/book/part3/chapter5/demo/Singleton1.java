package com.book.part3.chapter5.demo;
/**
 * @description    
 *     最简单的饿汉式的单例
 *      这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种，
 *      在单例模式中大多数都是调用getInstance方法，
 *      但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance显然没有达到lazy loading的效果。
 *   
 * @author vermouth.Mac
 * @version 2017年2月18日 下午1:09:11
 */

public class Singleton1 {
      private static Singleton1 singleton = new Singleton1();
      private Singleton1(){
    	  System.out.println("创建了一个实例。");
      }
      public static Singleton1 getInstance(){
    	  return singleton;
      }
}

/**
 * 饿汉变种  这种跟上面没啥区别
 * 
 * */

 class Singleton11{
	private static Singleton11 singleton;
	static{
		singleton = new Singleton11();
		System.out.println("创建了singleton对象");
	}
	private Singleton11(){
	}
	public static Singleton11 getInstance(){
		return singleton;
	}
	
	public static void main(String[] args) {
		Singleton11 s1 = Singleton11.getInstance();
		Singleton11 s2 = Singleton11.getInstance();
		if(s1==s2){
			System.out.println("right!");
		}else{
			throw new RuntimeException("Wrong");
		}
		
	}
}

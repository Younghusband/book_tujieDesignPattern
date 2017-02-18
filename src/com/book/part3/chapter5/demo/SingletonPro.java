package com.book.part3.chapter5.demo;
/**
 * @description 
 *        静态内部类方法
 *        
 *        这种方式同样利用了classloder的机制来保证初始化instance时只有一个线程，这种方式是Singleton类被装载了，
 *        instance不一定被初始化。因为SingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，
 *        从而实例化instance。想象一下，如果实例化instance很消耗资源，我想让他延迟加载，另外一方面，我不希望在Singleton类加载时就实例化，
 *        因为我不能确保Singleton类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化instance显然是不合适的。
 *        这个时候，这种方式就显得很合理。
 * 
 * @author vermouth.Mac
 * @version 2017年2月18日 下午3:03:25
 */

public class SingletonPro {
	private static class SingletonHolder {
		private static final SingletonPro INSTANCE = new SingletonPro();
	}
	private SingletonPro(){
	}
	public static SingletonPro getInstance(){
		return SingletonHolder.INSTANCE;    //内部类在被调用的时候才加载
	}
   
}

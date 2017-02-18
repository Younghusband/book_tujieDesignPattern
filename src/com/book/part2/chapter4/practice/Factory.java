package com.book.part2.chapter4.practice;
/**
 * @description 
 * @author vermouth.Mac
 * @version 2017年2月18日 上午9:43:55
 */

public abstract class Factory {
    
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}

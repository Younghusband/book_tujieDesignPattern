package com.book.part2.chapter4.demo;
/************************************************
    * Description: 
    *    使用了 Template Method 模式
    *    
    *    create   createProduct  registerProduct
    *    
    *    
    * 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月17日 下午4:46:06 
**************************************************/
public abstract class Factory {   
	
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);  
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}

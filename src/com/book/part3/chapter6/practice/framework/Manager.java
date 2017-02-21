package com.book.part3.chapter6.practice.framework;

import java.util.HashMap;
import java.util.Map;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月21日 上午10:40:34 
**************************************************/
public class Manager {
	
	private Map<String,Product> productBase = new HashMap<String,Product>();
	
	public void register(String key,Product value){
		productBase.put(key, value);
	}
	
	public Product create(String key){
		Product p = productBase.get(key);
		return p.createClone();
	}
	

}

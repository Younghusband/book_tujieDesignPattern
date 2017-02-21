package com.book.part3.chapter6.demo.famework;

import java.util.HashMap;
import java.util.Map;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月20日 下午5:41:45 
**************************************************/
public class Manager {
     private Map<String,Product> ObjBase = new HashMap<String,Product>();
     
     public void register(String name,Product product){
    	 ObjBase.put(name, product);
     }
     
     public Product create(String proname){
    	 Product p = (Product)ObjBase.get(proname);  //这个地方不加Product转换应该也一样吧
    	 return  p.createClone();   //还是不理解 这里为什么要clone 而不是直接返回p
     }
}

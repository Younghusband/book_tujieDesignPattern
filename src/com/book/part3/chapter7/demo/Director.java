package com.book.part3.chapter7.demo;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月21日 上午11:43:35 
**************************************************/
public class Director {
    private Builder builder;
    public Director(){
    	this.builder = builder;
    }
    
    public void construct(){
    	builder.makeTitle("Greeting");
    	
    	
    }
    
}

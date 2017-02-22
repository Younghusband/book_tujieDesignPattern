package com.book.part3.chapter7.practice;
/************************************************
    * Description: 
    *    has builder 
    *    use builder's methods
    * 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月21日 上午11:43:35 
**************************************************/
public class Director {
    private Builder builder;
    public Director(Builder builder){
    	this.builder = builder;
    }
    
    public void construct(){
    	builder.makeString("测试makeTitle的保险措施");  //这个也不会被调用
    	builder.makeTitle("改良版Greeting去死吧");
    	builder.makeString("从早上至afternoon.");
    	builder.makeItems(new String[]{
    		"早上好。",
    		"下午好。"
    	});
    	builder.makeString("晚上");
    	builder.makeItems(new String[]{
    			"晚上好。",
    			"晚安。",
    			"再见。"
    	});
    	builder.close();
    	builder.makeString("测试close方法！！");   //不会被调用
    }
    
}

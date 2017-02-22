package com.book.part3.chapter7.practice;
/************************************************
    * Description: 
    *    添加设置  
    *       判断方法被调用的顺序，
    *       有且仅有在makeTitle调用后 别的方法才可以被调用。
    *       close方法调用完后别的方法无法被调用。
    * 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月22日 下午2:48:18 
**************************************************/
public abstract class Builder {
	 private boolean flagStart = false;
	 private boolean flagEnd = true;
	 
	 public void makeTitle(String s){
		 if(!flagStart&&flagEnd){
			 buildTitle(s);
			 flagStart = true;
		 }
	 }
	 
	 public void makeString(String s){
		 if(flagStart&&flagEnd){
			 buildString(s);
		 }
	 }
	 
	 public void makeItems(String [] items){
		 if(flagStart&&flagEnd){
			buildItems(items);
		 }
	 }
	 
	 public void close(){
		 if(flagStart&&flagEnd){
			 buildclose();
			 flagEnd = false;
		 }
	 }
     
     protected abstract void buildTitle(String s);
     protected abstract void buildString(String s);
     protected abstract void buildItems(String [] items);
     protected abstract void buildclose();
}

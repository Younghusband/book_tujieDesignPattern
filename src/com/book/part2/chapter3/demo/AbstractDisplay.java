package com.book.part2.chapter3.demo;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月17日 下午2:46:35 
**************************************************/
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
//    public void display(){
    public final void display(){     //这种其实更符合模板模式的精神   那就是并不希望子类推翻父类的设计
    	open();
    	for(int i=1;i<=5;i++) print();
    	close();
    }
}

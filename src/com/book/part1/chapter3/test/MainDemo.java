package com.book.part1.chapter3.test;

import com.book.part1.chapter3.demo.AbstractDisplay;
import com.book.part1.chapter3.demo.CharDisplay;
import com.book.part1.chapter3.demo.StringDisplay;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月17日 下午2:51:10 
**************************************************/
public class MainDemo {
    public static void main(String[] args) {
		AbstractDisplay display1 = new CharDisplay('H'); 
		AbstractDisplay display2 = new StringDisplay("Hello world"); 
		AbstractDisplay display3 = new StringDisplay("杨帆"); 
		display1.display();
		display2.display();
		display3.display();
		
		
	}
}

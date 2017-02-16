package com.book.part1.chapter2.test;

import com.book.part1.chapter2.demo2.Print;
import com.book.part1.chapter2.demo2.PrintBanner;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午6:00:31 
**************************************************/
public class MainDemo2 {
	public static void main(String[] args) {
		Print print = new PrintBanner("类适配器模式");
		print.printStrong();
		print.printWeak();
	}
}

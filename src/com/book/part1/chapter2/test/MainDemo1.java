package com.book.part1.chapter2.test;

import com.book.part1.chapter2.demo1.Print;
import com.book.part1.chapter2.demo1.PrintBanner;

/************************************************
    * Description: 
    * 
    *   用户手里拿的是print 而且只有printStrong 和 printWeak
    *   你现有的功能是Banner类里的那一套。
    *   如何是好？
    *   做个中间类  适配器转换一下
    * 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午5:31:46 
**************************************************/
public class MainDemo1 {
           public static void main(String[] args) {
			Print print = new PrintBanner("类适配器模式");
			print.printStrong();
			print.printWeak();
		}
} 

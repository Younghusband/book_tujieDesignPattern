package com.book.part3.chapter7.test;

import com.book.part3.chapter7.demo.Director;
import com.book.part3.chapter7.demo.HTMLBuilder;
import com.book.part3.chapter7.demo.TextBuilder;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月22日 上午11:51:13 
**************************************************/
public class MainDemo {

	public static void main(String[] args) {
		if(args.length!=1){
			usage();
			System.exit(0);
		}
		
		if(args[0].equals("plain")){
			TextBuilder txt = new TextBuilder();
			Director director = new Director(txt);
			director.construct();
			System.out.println(txt.getResult());
		}else if(args[0].equals("html")){
			HTMLBuilder html = new HTMLBuilder();
			Director director = new Director(html);
			director.construct();
			String filename = html.getResult();
			System.out.println(filename+ "文件编写完成。");
		}else {
			usage();
			System.exit(0);
		}
		
	}
	
	public static void usage(){
		System.out.println("Usage: Java Main plain    编写纯文本文档");
		System.out.println("Usage: Java Main html    编写HTML文档");
	}
}

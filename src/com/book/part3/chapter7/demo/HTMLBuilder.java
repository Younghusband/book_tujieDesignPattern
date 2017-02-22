package com.book.part3.chapter7.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月22日 上午11:35:36 
**************************************************/
public class HTMLBuilder extends Builder{
    private String filename;
    private PrintWriter writer;  
	
	@Override
	public void makeTitle(String title) {  //编码问题 汉字乱码
		filename = "file"+File.separator+title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename)); //直接在根目录生成html
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\"/>");
		writer.println("<html><head><title>" + title +"</title></head><body>");
		//输出标题
		writer.println("<h1>" + title + "</h1>");
	}

	@Override
	public void makeString(String str) {
		writer.println("<p>"+str+"</p>");
	}

	@Override
	public void makeItems(String[] items) {
		writer.println("<ul>");
		for(String temp : items){
			writer.println("<li>"+ temp + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	public void close() {
		writer.println("</body></html>");
		writer.close();  //这步容易忽略
	}
	
	public String getResult(){
		return filename;
	}

}

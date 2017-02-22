package com.book.part3.chapter7.practice;

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
	
	public String getResult(){
		return filename;
	}

	@Override
	protected void buildTitle(String title) {
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
	protected void buildString(String str) {
		writer.println("<p>"+str+"</p>");
	}

	@Override
	protected void buildItems(String[] items) {
		writer.println("<ul>");
		for(String temp : items){
			writer.println("<li>"+ temp + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	protected void buildclose() {
		writer.println("</body></html>");
		writer.close();  //这步容易忽略
	}

}

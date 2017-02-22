package com.book.part3.chapter7.demo;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月22日 上午9:30:07 
**************************************************/
public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
	   buffer.append("======================\n");
	   buffer.append("【"+title+"】\n\n");  // could this be
	}

	@Override
	public void makeString(String string) {
		buffer.append("*"+string+"\n");
		buffer.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		for(String temp : items){
			buffer.append("  ."+temp+"\n");
		}
		buffer.append("\n");
	}

	@Override
	public void close() {
		buffer.append("======================\n");
	}
	
	public String getResult(){
		return buffer.toString();
	}

}

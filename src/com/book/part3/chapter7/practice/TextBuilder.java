package com.book.part3.chapter7.practice;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月22日 下午3:07:53 
**************************************************/
public class TextBuilder extends Builder {
	private StringBuffer buffer = new StringBuffer();
	@Override
	protected void buildTitle(String title) {
		buffer.append("======================\n");
		   buffer.append("【"+title+"】\n\n");  // could this be
	}

	@Override
	protected void buildString(String string) {
		buffer.append("*"+string+"\n");
		buffer.append("\n");
	}

	@Override
	protected void buildItems(String[] items) {
		for(String temp : items){
			buffer.append("  ."+temp+"\n");
		}
		buffer.append("\n");
	}

	@Override
	protected void buildclose() {
		buffer.append("======================\n");
	}
    
	public String getResult(){
		return buffer.toString();
	}
}

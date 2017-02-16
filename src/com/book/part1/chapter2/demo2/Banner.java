package com.book.part1.chapter2.demo2;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午5:27:35 
**************************************************/
public class Banner {
	private String content;
	public Banner(String input){
		this.content = input;
	}
	
	public void showWithParen(){                  //没错 现在他妈现有的就是这俩方法！
		System.out.println("("+content+")");   
	}
	
	public void showWithAster(){
		System.out.println("*"+content+"*");
	}

}

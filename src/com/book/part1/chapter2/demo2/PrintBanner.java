package com.book.part1.chapter2.demo2;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午5:58:38 
**************************************************/
public class PrintBanner extends Print {
    private Banner banner;
	
	public PrintBanner(String s){
		banner = new Banner(s);
	}
	
	
	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
       banner.showWithAster();
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
       banner.showWithParen();
	}

}

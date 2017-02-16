package com.book.part1.chapter2.demo1;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月16日 下午5:30:18 
**************************************************/
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String s){
    	super(s);
    }
	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
        showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
        showWithAster();
	}

}

package com.book.part1.chapter3.demo;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月17日 下午2:48:46 
**************************************************/
public class CharDisplay extends AbstractDisplay {
	private char c;
	
	public CharDisplay(char c){
		this.c = c;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
        System.out.print("<<");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
        System.out.print(c);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.print(">>");
		System.out.println();
	}

}

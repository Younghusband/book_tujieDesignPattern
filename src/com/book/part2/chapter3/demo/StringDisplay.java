package com.book.part2.chapter3.demo;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月17日 下午2:50:52 
**************************************************/
public class StringDisplay extends AbstractDisplay {
    private String con;
    private int width;
    
    public StringDisplay(String x){
    	this.con = x;
    	this.width = x.getBytes().length;
    }
	@Override
	public void open() {
		// TODO Auto-generated method stub
       printLine();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("|"+con+"|");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
       printLine();
	}
	
	public void printLine(){
		System.out.print("+");
		for(int i=1;i<=width;i++){
			System.out.print("-");
		}
	    System.out.println("+");
	}

}

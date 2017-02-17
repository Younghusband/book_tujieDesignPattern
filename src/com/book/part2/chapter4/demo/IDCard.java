package com.book.part2.chapter4.demo;
/************************************************
    * Description: 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月17日 下午4:53:22 
**************************************************/
public class IDCard extends Product {
    private String owner;
    
    public IDCard(String owner){
    	System.out.println("制作"+owner+" 的ID卡。");
    }
	
	
	
	@Override
	public void use() {
		// TODO Auto-generated method stub

	}

}

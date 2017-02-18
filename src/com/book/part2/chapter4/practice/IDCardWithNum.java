package com.book.part2.chapter4.practice;
/**
 * @description 
 * @author vermouth.Mac
 * @version 2017年2月18日 上午9:46:45
 */

public class IDCardWithNum extends Product{
	private String owner;
	private int serial;
	
	IDCardWithNum (int serial,String owner){
		System.out.println("正在制作号码为"+serial+"  "+owner+"的ID卡。");
		this.serial = serial;
		this.owner = owner;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(owner+"在使用他卡号为"+serial+"的ID卡");
	}
	
	public String getOwner(){
		return this.owner;
	}
	
	public int getSerial(){
		return this.serial;
	}

	

}

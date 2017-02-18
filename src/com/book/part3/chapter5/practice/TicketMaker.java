package com.book.part3.chapter5.practice;
/**
 * @description  
 *     
 * 
 * @author vermouth.Mac
 * @version 2017年2月18日 下午3:14:16
 */

public class TicketMaker {
	private static TicketMaker maker = new TicketMaker();
	private TicketMaker(){}
	
	public static TicketMaker getInstance(){
		return maker;
	}
	
	private static int ticket = 1000;
	public synchronized int getNextTicketNumber(){  //这里的synchronized太容易忽略了
		return ticket++;
	}
	public int getTicketNum(){
		return TicketMaker.ticket;
	}
   
}

class Testor {
	
	public static void main(String[] args) {
		TicketMaker t1 = TicketMaker.getInstance();
		t1.getNextTicketNumber();
		t1.getNextTicketNumber();
		t1.getNextTicketNumber();
		t1.getNextTicketNumber();
		t1.getNextTicketNumber();
		TicketMaker t2 = TicketMaker.getInstance();  //假设人员误操作又创建一次对象
		if(t1!=t2) throw new RuntimeException("stupid!");
		t2.getNextTicketNumber();   
		System.out.println(t2.getTicketNum());
		
	}
}
package com.book.part3.chapter5.practice;

/**
 * @description 保证最多只能生成3个Triple的实例，实例编号分别为0，1，2 且可以通过 getInstance(int id)
 *              来获取该编号对应的实例
 * 
 * @author vermouth.Mac
 * @version 2017年2月18日 下午3:22:38
 */

public class Triple {
	private int id;
	private static Triple[] tripleArr = new Triple[] { new Triple(0), new Triple(1), new Triple(2) };

	private Triple(int id) {
		this.id = id;
		System.out.println("The instance "+id+" is created.");
	}
	
	public static Triple getInstance(int id) {
		if (id >= 3) {
			System.out.println("id不能大于2");
			return null;
		}
		return tripleArr[id];
	}

	public int getId() {
		return this.id;
	}
	
	public String toString(){
		return "[Triple id ="+id+" ]";
	}


}

class Testor1 {

	public static void main(String[] args) {
		System.out.println("Start.");
		for(int i=0;i<9;i++){
			Triple t = Triple.getInstance(i%3);
			System.out.println(i+":"+t);
		}
		System.out.println("End.");
	}

}

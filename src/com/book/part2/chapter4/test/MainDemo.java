package com.book.part2.chapter4.test;

import com.book.part2.chapter4.demo.Factory;
import com.book.part2.chapter4.demo.IDCardFactory;
import com.book.part2.chapter4.demo.Product;

/**
 * @description 
 * @author vermouth.Mac
 * @version 2017年2月18日 上午12:10:28
 */

public class MainDemo {
    public static void main(String[] args) {
		Factory fac1 = new IDCardFactory();
		Product card1 = fac1.create("杨帆");
		Product card2 = fac1.create("小明");
		Product card3 = fac1.create("嘿嘿嘿");
		
		card1.use();
		card2.use();
		card3.use();
		System.out.println(((IDCardFactory)fac1).getOwners());
		//fac1 如果不转换为IDCardFactory类型的话 仅仅只能使用Factory抽象类规定的方法。
		
		
	}
}

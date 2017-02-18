package com.book.part2.chapter4.test;

import com.book.part2.chapter4.practice.Factory;
import com.book.part2.chapter4.practice.IDCardWithNum;
import com.book.part2.chapter4.practice.IDCardWithNumFactory;
import com.book.part2.chapter4.practice.Product;

/**
 * @description 
 * @author vermouth.Mac
 * @version 2017年2月18日 上午11:31:50
 */

public class MainPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Factory fac1 = new IDCardWithNumFactory();
             Product p1 = fac1.create("杨帆");
             Product p2 = fac1.create("张数");
             Product p3 = fac1.create("掉之三");
             Product p4 = fac1.create("黄翔");
             Product p5 = fac1.create("汪再军");
             Product p6 = fac1.create("徐文才");
             
             p3.use();
             System.out.println(((IDCardWithNumFactory)fac1).getOwners());
             System.out.println(((IDCardWithNumFactory)fac1).selectFromDatabase());
             
	}

}

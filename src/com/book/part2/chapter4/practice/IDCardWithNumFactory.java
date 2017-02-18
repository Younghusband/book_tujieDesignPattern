package com.book.part2.chapter4.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description 
 * @author vermouth.Mac
 * @version 2017年2月18日 上午11:04:18
 */

public class IDCardWithNumFactory extends Factory{
    private List<String> owners = new ArrayList<String>();
    private static int no = 100;
	private Map<Integer,String> database = new HashMap<Integer,String>();
	
	
	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCardWithNum(no++,owner);
	}

	@Override
	protected void registerProduct(Product product) {
		IDCardWithNum idCard = (IDCardWithNum)product;
		owners.add(idCard.getOwner());
		database.put(idCard.getSerial(), idCard.getOwner());
	}
	
	public List<String> getOwners(){
		return owners;
	}
	
	public Map<Integer,String> selectFromDatabase(){
		return database;
	}
	
	

}

package com.book.part2.chapter4.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 
 * @author vermouth.Mac
 * @version 2017年2月17日 下午7:43:03
 */

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    
	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
        owners.add(((IDCard)product).getOwner());
	}
	
	public List getOwners(){
		return owners;
	}

}

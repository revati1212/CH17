package com.java.implement;

import com.java.Internal.MallRule;

public class OrianMall implements MallRule {

	@Override
	public boolean validId() {
		System.out.println("running validId");
		return false;
	}
	

}

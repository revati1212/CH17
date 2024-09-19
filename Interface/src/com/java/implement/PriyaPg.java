package com.java.implement;

import com.java.Internal.PgRule;

public class PriyaPg implements PgRule{

	@Override
	public double costpermonth() {
	System.out.println("running costpermonth");
		return 0;
	}

	@Override
	public boolean wifi() {
		System.out.println("running wifi");
		return false;
	}
	

}

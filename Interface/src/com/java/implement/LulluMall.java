package com.java.implement;

import com.java.Internal.MallRule;


public class LulluMall  {
	private MallRule mallRule;
	public LulluMall(MallRule mallRule) {
	super();
		this.mallRule=mallRule;
	}
	public void SecurityCheck() {
		System.out.println("running SecurityCheck");
		if(mallRule!=null) {
			boolean yes= mallRule.validId();
			if(yes)
				System.out.println("ID is Valid");
		}
		else {
			System.out.println("ID is not correct");
		}
	}
	
	

}



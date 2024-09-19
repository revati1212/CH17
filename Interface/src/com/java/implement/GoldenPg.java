package com.java.implement;


import com.java.Internal.PgRule;

public class GoldenPg {
	private PgRule pgRule;
	public GoldenPg(PgRule pgRule) {
	super();
		this.pgRule=pgRule;
	}
	public void LateEntry() {
		System.out.println("running LateEntry");
		if(pgRule!=null) {
			double costpermonth =pgRule.costpermonth();
			boolean speed=pgRule.wifi();
			if (costpermonth<5500) {
			System.out.println(" cost is 5500");
			}
			else {
				System.out.println("cost is more");
			}
			if(speed) {
				System.out.println("pg have wifi connectin");
			}
		else {
			System.out.println("dont have wifi connection");
		}
		}}}
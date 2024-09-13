package com.inheritance.bulb;

public class Bulb {
	

	public double price;

	public Bulb() {
		System.out.println("created buld constructor with no argu..");

	}

	public void light() {
		System.out.println("running light");
		System.out.println("price of bulb:"+price);
	}

}
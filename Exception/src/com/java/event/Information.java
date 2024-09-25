package com.java.event;

public class Information {

	public void run(String NameException)throws NameException{
		System.out.println("run in Information");
		if(NameException==null || NameException.equals(" ")) {
			System.out.println("invalid Information");
			throw new NameException();
		}
		else {
			System.out.println("valid Information");
		}
	}
}

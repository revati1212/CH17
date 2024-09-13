package com.xworkz.gun;

public class revati {
	private String name;
	private String countryMade;
	private String type;

	public void Gun() {

		System.out.println("created gun using no arg constructor");
	}

	public void Gun(String name, String countryMade, String type) {
		
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}

	public void fire() {
		System.out.println("running fire in Gun....");

	}

	public void display() {
		System.out.println("name of gun: " + this.name);
		System.out.println("country made : " + this.countryMade);
		System.out.println("type of gun: " + this.type);

	}


}

package com.xworks.classcast;

public class Kettle {
	private String name;
	private String materials;
	private int capacity;
	private double price;
	private int power;
	private boolean automaticShutdown;


	public Kettle(String name, String materials, int capacity, double price, int power, boolean automaticShutdown) {
		super();
		this.name = name;
		this.materials = materials;
		this.capacity = capacity;
		this.price = price;
		this.power = power;
		this.automaticShutdown = automaticShutdown;
	}


	@Override
	public String toString() {
		return "Kettle [name=" + name + ", materials=" + materials + ", capacity=" + capacity + ", price=" + price
				+ ", power=" + power + ", automaticShutdown=" + automaticShutdown + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {

			if(obj instanceof Kettle) {

				Kettle kettle=(Kettle)obj;
				System.out.println("use instanceof to convert subclass type into parent type");

				if(this.name.equals(kettle.name) && this.capacity==kettle.capacity &&this.price==kettle.price)
				{
					System.out.println("check the two given ref are equal or not");
					return true;
				}
				else
				{
					System.out.println("both are not equals");
				}

			}
			else 
			{
				System.out.println("obj is null");
			}

			}


		return super.equals(obj);
	}




}

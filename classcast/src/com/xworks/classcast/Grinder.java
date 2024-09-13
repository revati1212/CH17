package com.xworks.classcast;

public class Grinder {

	private String name;
	private String color;
	private double price;
	private int discount;
	private int powerConsumption;
	private int noOfJars;

	public Grinder(String name, String color, double price, int discount, int powerConsumption, int noOfJars) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.discount = discount;
		this.powerConsumption = powerConsumption;
		this.noOfJars = noOfJars;
	}

	@Override
	public String toString() {
		return "Grinder [name=" + name + ", color=" + color + ", price=" + price + ", discount=" + discount
				+ ", powerConsumption=" + powerConsumption + ", noOfJars=" + noOfJars + "]";
	}

	@Override
	public boolean equals(Object obj) {
			if (obj!=null) {

			if(obj instanceof Grinder) {

				Grinder grinder=(Grinder)obj;
				System.out.println("use instanceof to convert subclass type into parent type");

				if(this.name.equals(grinder.name) && this.powerConsumption==grinder.powerConsumption &&this.price==grinder.price)
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

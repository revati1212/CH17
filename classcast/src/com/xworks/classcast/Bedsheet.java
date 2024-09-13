package com.xworks.classcast;

public class Bedsheet {
	private String fabric;
	private String size;
	private String color;
	private int durability;
	private double price;
	private int discount;

	public Bedsheet(String fabric, String size, String color, int durability, double price, int discount) {
		super();
		this.fabric = fabric;
		this.size = size;
		this.color = color;
		this.durability = durability;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Bedsheet [fabric=" + fabric + ", size=" + size + ", color=" + color + ", durability=" + durability
				+ ", price=" + price + ", discount=" + discount + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {

			if(obj instanceof Bedsheet) {

				Bedsheet bedsheet=(Bedsheet)obj;
				System.out.println("use instanceof to convert subclass type into parent type");

				if(this.fabric.equals(bedsheet.fabric) && this.color.equals(bedsheet.color) &&this.price==bedsheet.price)
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



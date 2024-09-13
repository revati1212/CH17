package com.xworks.classcast;


public class Jeans {
	private String name;
	private String color;
	private double price;
	private int size;
	private String type;
	private int pockets;


	public Jeans(String name, String color, double price, int size, String type, int pockets) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.size = size;
		this.type = type;
		this.pockets = pockets;
	}


	@Override
	public String toString() {
		return "Jeans [name=" + name + ", color=" + color + ", price=" + price + ", size=" + size + ", type=" + type
				+ ", pockets=" + pockets + "]";
	}


	@Override
	public boolean equals(Object obj) 
	{
		if(obj!=null) 
		{
			if(obj instanceof Jeans) 
			{
				Jeans jeans=(Jeans)obj;
				System.out.println("use instanceof to convert subclass type into parent type");

				if(this.size==jeans.size && this.pockets==jeans.pockets &&this.price==jeans.price)
				{
					System.out.println("check the two given ref are equal or not");
					return true;
				}
				else
				{
					System.out.println("obj and this are not equals");
				}

			}
			else 
			{
				System.out.println("obj in null");
			}


		}

			return super.equals(obj);


	}	

}
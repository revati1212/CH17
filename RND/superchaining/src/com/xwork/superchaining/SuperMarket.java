package com.xwork.superchaining;


	public class SuperMarket extends Market {
		
		public SuperMarket(String name, String location) {
			super(name,location);
			System.out.println("Running SuperMarket in Market with name and location parameters");
		}
		
			public SuperMarket(int shops, String type) {
				super(shops,type);
				System.out.println("Running SuperMarket in Market with shops and type parameters");

		}
		public SuperMarket(String location, int shops) {
			super(location,shops);
			System.out.println("Running SuperMarket in Market with location and shops parameters");
		}


		public SuperMarket() {
			super("Big Bazar","Dharwad",30,"Grocery");
			System.out.println("Running SuperMarket in Market with all 4 parameters");

		}

	}



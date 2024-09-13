package com.xwork.superchaining;

public class Market {
	 

		private String name;
		private String location;
		private int shops;
		private String type;

		public Market(String name, String location) {
			super();
			this.name = name;
			this.location = location;
		}
		
		public Market(int shops, String type) {
			super();
			this.shops = shops;
			this.type = type;
		}
		public Market(String location, int shops) {
			super();
			this.location = location;
			this.shops = shops;
		}


		public Market(String name, String location, int shops, String type) {
			super();
			this.name = name;
			this.location = location;
			this.shops = shops;
			this.type = type;
		}

		public void display() {

			System.out.println("Display Market");
				System.out.println("Market Name :"+name);
				System.out.println("Location :"+location);
				System.out.println("Number of Shops :"+shops);
				System.out.println("Type :"+type);
				
			}

}

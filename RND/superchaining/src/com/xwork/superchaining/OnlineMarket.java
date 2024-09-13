package com.xwork.superchaining;


	public class OnlineMarket extends Market {
		
		public OnlineMarket(String name, String location) {
			super(name,location);
			System.out.println("Running OnlineMarket in Market with name andlocation");

		}
		
		public OnlineMarket(int shops, String type) {
			super(shops,type);
			System.out.println("OnlineMarket constructer with type & shops parameters");

		}

		public OnlineMarket(String location, int shops) {
			super(location,shops);
			System.out.println("Running OnlineMarket in Market with location and shops");
		}


		public OnlineMarket() {
			super("Flipkart","India",1000000,"Anything");
			System.out.println("Running OnlineMarket in Market with all 4 parameters");

		}

	}


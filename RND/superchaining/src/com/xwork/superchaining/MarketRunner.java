package com.xwork.superchaining;

public class MarketRunner {

	public static void main(String[] args) {
	

			

				SuperMarket superMarket = new SuperMarket("bijapur",10);
				superMarket.display();

				SuperMarket superMarket1 = new SuperMarket(89,"Perfumes");
				superMarket1.display();

				SuperMarket superMarket2 = new SuperMarket("Shopping Stalls","Jayanagar");
				superMarket2.display();

				SuperMarket superMarket3 = new SuperMarket();
				superMarket3.display();

				OnlineMarket onlineMarket = new OnlineMarket("Banglore",12345);
				onlineMarket.display();

				OnlineMarket onlineMarket1 = new OnlineMarket(24,"Gadgets");
				onlineMarket1.display();

				OnlineMarket onlineMarket2 = new OnlineMarket("Pune",1924);
				onlineMarket2.display();

				OnlineMarket onlineMarket3 = new OnlineMarket();
				onlineMarket3.display();

			}

		}

	
package com.java.internetprovider;

public class AirtelInternetProvider extends InternetProvider {
	public AirtelInternetProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Running AirtelInternetProvider in InternetProvider");
	}
		@Override
		public void service() {
			System.out.println("Running Service in AirtelInternetProvider ");
	}



}

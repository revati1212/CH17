package com.java.internetprovider;

public class JioProvider extends InternetProvider {
	public JioProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Running JioProvider in InternetProvider");
	}
	@Override
	public void service() {
		System.out.println("Running Service in AirtelInternetProvider ");
}
}

package com.java.internetprovider;

public class ExtremeAirtelInternetProvider extends AirtelInternetProvider {
	public ExtremeAirtelInternetProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Running ExtremeAirtelInternetProvider AirtelInternetProvider ");
	}

	@Override
	public void service() {
		System.out.println("Running Service in ExtremeAirtelInternetProvider");

}}

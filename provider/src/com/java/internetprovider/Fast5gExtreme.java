package com.java.internetprovider;

public class Fast5gExtreme  extends ExtremeAirtelInternetProvider{
	public Fast5gExtreme(String name, String ceo) {
		super(name, ceo);
		System.out.println("Constructor of Fast 5G Extreme");
	}
	@Override
	public void service() {
		System.out.println("Running Service in InternetProvider");
}

}

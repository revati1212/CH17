package com.java.internetprovider;
import com.java.provider.Provider;

public  class InternetProvider extends Provider{
	public InternetProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Running  InternetProvider in Provider");
	}

	@Override
	public void service() {
		
		
	}


}
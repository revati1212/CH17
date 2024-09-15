package com.java.provider;

public class BookingProvider extends Provider {

	public BookingProvider(String name, String CEO) {
		super(name, CEO);
	}

	@Override
	public void service() {
		System.out.println("Running Service in BookingProvider");

	}

}
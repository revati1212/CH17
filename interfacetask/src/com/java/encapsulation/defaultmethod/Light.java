package com.java.defaultmethod;

public class Light implements Device {

	@Override
	public void turnOn() {
		System.out.println("turnOn lights");
		
	}
	
	

static class Bluetooth implements Device {

	@Override
	public void turnOn() {
		System.out.println("turnOn Bluetooth");
		
	}
	
}
}
package com.java.defaultmethod;

public class Runner {
	
	    public static void main(String[] args) {
	        Device light = new Light();
	        light.turnOn();
	        light.WiFi("xworks ");

	        Device bluetooth = new Bluetooth();
	        bluetooth.turnOn();
	        bluetooth.WiFi("oppo");
	        
	        
	    }
	}



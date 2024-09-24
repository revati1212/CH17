package com.java.defaultmethod;

public interface Device {
	   void turnOn(); 

	    default void WiFi(String network) {
	        System.out.println(" WiFi network: " + network);
	    }
	}



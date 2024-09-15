package com.java.provider;

public class BookMyShow extends MovieBookingProvider {
	
public int totalHalls;

public BookMyShow(String name, String ceo, int totalHalls) {
	super(name, ceo);
		this.totalHalls = totalHalls;
			System.out.println("Running totalhalls in BookMyShow ");
		}

	}



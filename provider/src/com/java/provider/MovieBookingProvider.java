package com.java.provider;

public class MovieBookingProvider extends BookingProvider {

	   	    public MovieBookingProvider(String name, String CEOname) {
		super(name, CEOname);
		
		System.out.println("Running  MovieBookingProvider ");
		}

		public void book() {
			System.out.println("Running Book in MovieBookingProvider");
		}

		public void cancel() {
			System.out.println("Running  cancel in MovieBookingProvider");
		}

	}
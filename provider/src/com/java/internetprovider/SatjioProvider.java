package com.java.internetprovider;
import java.time.LocalDate;

public class SatjioProvider {
	public double cost;
	public LocalDate launchDate;

	public SatjioProvider( double cost, String string, LocalDate launchDate) {
		
		this.cost=cost;
		this.launchDate=launchDate ;
		System.out.println("Running SatjioProvider using double cost, LocalDate launchDate");
	}


		
	}

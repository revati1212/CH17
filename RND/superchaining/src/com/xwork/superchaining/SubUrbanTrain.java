package com.xwork.superchaining;

public class SubUrbanTrain extends Train {
	public SubUrbanTrain(int trainNumber, String destination){
		super(trainNumber,destination);
		System.out.println("Running SubUrbanTrain in Train with number & destination");
	}

	public SubUrbanTrain() {
		super("Hubli","Gulbarga");
		System.out.println("Running SubUrbanTrain in Train wuth source & destination");
	}

	public SubUrbanTrain(int trainNumber,String source,String destination) {
		super(trainNumber,source,destination);
		System.out.println("Running SubUrbanTrain in Train with all 3 constructors");
	}


}



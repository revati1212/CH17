package com.xwork.superchaining;

public class MetroTrain extends Train {

	public MetroTrain(int trainNumber, String destination) {
		super(trainNumber,destination);
		System.out.println("Running MetroTrain in Train with number & destination");
	}

	public MetroTrain() {
		super("Chennai","Banglore");
		System.out.println("Running MetroTrain in Train with source & destination");
	}

	public MetroTrain(int trainNumber,String source, String destination) {
		super(trainNumber,source,destination);
		System.out.println("Running MetroTrain in Train with all 3 constructors");
	}
}


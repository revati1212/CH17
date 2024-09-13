package com.xwork.superchaining;

public class Train {
	
	private int trainNumber;
	private String source;
	private String destination;

	public Train(int trainNumber, String destination) {
		super();
		this.trainNumber = trainNumber;
		this.destination = destination;
	}

	public Train(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}

	public Train(int trainNumber,String source, String destination) {
		super();
		this.trainNumber = trainNumber;
		this.source = source;
		this.destination = destination;
	}

	public void display() {
		System.out.println("Display Train");
			System.out.println("Train Number :"+trainNumber);
			System.out.println("Source :"+source);
			System.out.println("Destination :"+destination);

		
		}
	}



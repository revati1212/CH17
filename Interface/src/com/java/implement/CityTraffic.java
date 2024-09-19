package com.java.implement;


import com.java.Internal.TrafficRule1;

public class CityTraffic {
	private TrafficRule1 trafficRule1;
	public  CityTraffic(TrafficRule1 trafficRule1) {
		super();
		this.trafficRule1 = trafficRule1;
	}
	public void Vehicles() {
		System.out.println("running Vehicles");
		if(trafficRule1!=null) {
			 trafficRule1.licenceNo();
			 
			System.out.println("vehicle have licenceno");
					}
					else {
	
			System.out.println("vehicle dont have licenceno");
		}
	}
	
	
	}

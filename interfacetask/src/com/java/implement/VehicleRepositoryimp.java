package com.java.implement;

import com.java.internal.VehicleRepository;


public class VehicleRepositoryimp implements VehicleRepository {

		
	

	@Override
	public void save() {
		System.out.println("running save in VehicleRepositoryimp");
		
	}

	@Override
	public void update() {
		System.out.println("running update in VehicleRepositoryimp");
		
	}

	@Override
	public boolean delete() {
		System.out.println("running delete in VehicleRepositoryimp");
		return true;
	}

	@Override
	public String read() {
		System.out.println("running read in VehicleRepositoryimp");
		return "reading success";
	}
	

}

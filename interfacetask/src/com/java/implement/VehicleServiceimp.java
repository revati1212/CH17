package com.java.implement;

import com.java.internal.VehicleRepository;
import com.java.internal.VehicleService;

public class VehicleServiceimp implements VehicleService{

	private VehicleRepository vehicleRepository;
	
	
	public VehicleServiceimp(VehicleRepository vehicleRepository) {
		this.vehicleRepository= vehicleRepository;
		
	

}


	@Override
	public void persist() {
		if(vehicleRepository != null) {
			System.out.println("Save is not null");
			vehicleRepository.save();
		}else {
			System.out.println("Save is null");
		}
		
	
		
	}


	@Override
	public void merge() {
		if(vehicleRepository != null) {
			System.out.println("Update is not Null");
			vehicleRepository.update();
		}else {
			System.out.println("Update is Null");
		}	
	}


	@Override
	public boolean clear() {
		if(vehicleRepository != null) {
			boolean delete=vehicleRepository.delete();
			if(delete) {
				System.out.println("Delete Succesfully");
				return true;
			}else {
				System.out.println("cant delete");
			}
		}
		return false;
	}


	@Override
	public String search() {
		if(vehicleRepository != null) {
			vehicleRepository.read();
			return "successful";
			
		}else {
			System.out.println("Read is null");
		}
		return "failed";
	}

}
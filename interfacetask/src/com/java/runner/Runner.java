package com.java.runner;

import com.java.implement.AddressRepositoryimp;
import com.java.implement.AddressServiceimp;
import com.java.implement.MachineRepositoryimp;
import com.java.implement.MachineServiceimp;
import com.java.implement.VehicleRepositoryimp;
import com.java.implement.VehicleServiceimp;
import com.java.internal.AddressRepository;
import com.java.internal.AddressService;
import com.java.internal.MachineRepository;
import com.java.internal.MachineService;
import com.java.internal.VehicleRepository;
import com.java.internal.VehicleService;

public class Runner {

	public static void main(String[] args) {
		AddressRepository repository = new AddressRepositoryimp();

		AddressService service = new AddressServiceimp(repository);
		boolean ref = service.push();
		System.out.println(ref);
		System.out.println("----------");
		int ref1 = service.refresh();
		System.out.println(ref1);
		System.out.println("----------");
		service.remove();
		System.out.println("----------");
		String ref5 = service.load();
		System.out.println(ref5);
		
       MachineRepository repository1= new MachineRepositoryimp();
		
		MachineService service1= new MachineServiceimp(repository1);
		service1.save();
		System.out.println("----------");
		int ref2=service1.update();
		System.out.println("Updated :"+ref2);
		System.out.println("----------");
		int ref4=service1.delete();
		System.out.println("Deleted:"+ref4);
		System.out.println("----------");
		int read=service1.read();
		System.out.println("Readed:"+read);
		
		

		VehicleRepository repository2= new VehicleRepositoryimp();
		
		VehicleService service2= new VehicleServiceimp(repository2);
		service2.persist();
		System.out.println("----------");
		service2.merge();
		System.out.println("----------");
		boolean ref6=service2.clear();
		System.out.println("Clear :"+ref6);
		System.out.println("----------");
		String search=service2.search();
		System.out.println("Search :"+search);

	}


	}




	

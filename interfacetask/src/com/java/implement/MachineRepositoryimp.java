package com.java.implement;

import com.java.internal.MachineRepository;

public class MachineRepositoryimp  implements  MachineRepository {

	@Override
	public void save() {
		 System.out.println("running save in MachineRepositoryimp");
		
	}

	@Override
	public int update() {
		System.out.println("running save in MachineRepositoryimp");
		return 2;
	}

	@Override
	public int delete() {
		System.out.println("running save in MachineRepositoryimp");
		return 1;
	}

	@Override
	public int read() {
		System.out.println("running save in MachineRepositoryimp");
		return 3;
	}
	

}

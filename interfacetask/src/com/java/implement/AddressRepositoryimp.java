package com.java.implement;

import com.java.internal.AddressRepository;

public class AddressRepositoryimp implements AddressRepository {

	@Override
	public boolean save() {
		System.out.println("running save in AddressRepositoryimp");
		return true;
	}

	@Override
	public int update() {
		System.out.println("running update in AddressRepositoryimp");
		return 1;
	}

	@Override
	public void delete() {
		System.out.println("running delete in AddressRepositoryimp");
		
	}

	@Override
	public String read() {
		System.out.println("running read in AddressRepositoryimp");
		return "read";
	}

}

package com.java.implement;

import com.java.internal.AddressRepository;
import com.java.internal.AddressService;

public class AddressServiceimp implements AddressService {
	private AddressRepository addressRepository;

	public AddressServiceimp(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	@Override
	public boolean push() {
		if (addressRepository != null) {
			boolean saved = addressRepository.save();
			if (saved) {
				System.out.println("Saved Success" + saved);
				return true;
			}}
			else
			{
		System.out.println("save failed");
		
			}
			return false;
		}

	@Override
	public int refresh() {
		if (addressRepository != null) {
			int ref = addressRepository.update();
			if (ref >1) {
				System.out.println("refresh" + ref);
				return ref;
			}
		} else {
			System.out.println("cant refresh");
		}
		return 0;

	}

	@Override
	public void remove() {
		if (addressRepository != null) {
			System.out.println("addressRepository is not null");
			addressRepository.delete();
		} else {
			System.out.println("addressRepository is null");
		}

	
	}

	@Override
	public String load() {
		if (addressRepository != null) {

			addressRepository.read();
			return "load Success";
		} else {
			System.out.println("NULL");
		}
		return "load Failed";
	}

}
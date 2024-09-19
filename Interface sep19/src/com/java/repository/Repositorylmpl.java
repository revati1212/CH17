package com.java.repository;

public class Repositorylmpl implements Repository {

	@Override
	public boolean save() {
		System.out.println("overeide save in Repositorylmpl ");
		return true;
	}
	

}

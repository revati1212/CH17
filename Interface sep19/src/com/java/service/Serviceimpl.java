package com.java.service;

import com.java.repository.Repository;

public class Serviceimpl implements Service {

	private Repository repository;

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	@Override
	public String push() {
	System.out.println("override push in Serviceimpl");
		if(repository!=null)
		{
			System.out.println("repository is not null");
			boolean store=repository.save();
			if(store)
			{
				System.out.println("running repo in store");
				return "success";
			}
			else
			{
				System.out.println("repo is not not stored");
			
		return "failure";
	}
}
return "issue";	

}
}
	
	


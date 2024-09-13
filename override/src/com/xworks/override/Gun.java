package com.xworks.override;

public class Gun extends Weapon{

	@Override
	public void use()
	{
		System.out.println("Running Use in Gun");
	}
	@Override
	public void fire()
	{
		System.out.println("Running fire in Gun");

	}
	public void trigger()
	{
		System.out.println("Running a trigger in Gun");
		use();
		fire();
	}



}

package com.xworks.override;

public class Revati {
	Weapon weapon=new Weapon();
	Gun gun =new Gun();

	public void shoot()
	{
		System.out.println("Running a shoot in Revati");
		weapon.use();
		weapon.fire();

	}

	public void bullet()
	{
		System.out.println("Running a bullet in Revati");
		gun.use();
		gun.fire();
		gun.trigger();
	}

}



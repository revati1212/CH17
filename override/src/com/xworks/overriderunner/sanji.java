package com.xworks.overriderunner;
import com.xworks.override.Gun;
import com.xworks.override.Weapon;

public class sanji {
	Weapon weapon=new Weapon();
	Gun gun=new Gun();

	public void display()
	{
		weapon.use();
		weapon.fire();

	}

	public void load()
	{
		gun.use();
		gun.fire();
		gun.trigger();

	}


}



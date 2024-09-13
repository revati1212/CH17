package com.xworks.instance;

public class Dancer {
public void use(Belt belt)
{
	System.out.println("using dancer");
	belt.tie();
	if(belt instanceof LeatherBelt)
	{
		System.out.println("creating instanceof in leatherbelt");
		LeatherBelt leatherbelt=(LeatherBelt)belt;
	}
	
}

}

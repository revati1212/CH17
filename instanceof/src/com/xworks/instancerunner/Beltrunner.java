package com.xworks.instancerunner;
import com.xworks.instance.Belt;
import com.xworks.instance.LeatherBelt;
import com.xworks.instance.Dancer;

public class Beltrunner {

	public static void main(String[] args) {
		Dancer dancer=new Dancer();
		Belt belt=new Belt();
		LeatherBelt leatherbelt=new LeatherBelt();
leatherbelt.clip();
dancer.use(leatherbelt);
dancer.use(belt);

	}

}

package com.xworkz.gunRunner;
public class Snippet {

	public static void main(String[] args) {

		Solider solider = new Solider();
		solider.trigger();
		Police police = new Police();
		Gun gun = new Gen("MI895", "India", "Revolver");
		police.shoot(gun);
		Dboss dboss = new Dboss(gun);
		dboss.use();
		Godse godse = new Godse();
		godse.hold();

	}

}

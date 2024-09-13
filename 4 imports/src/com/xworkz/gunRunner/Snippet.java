package com.xworkz.gunRunner;



import com.xworkz.gun.products.Gun;


public class GunRunner {

	public static void main(String[] args) {

		Solider solider = new Solider();
		solider.trigger();
		Police police = new Police();
		Gun gun = new Gun("MI895", "India", "Revolver");
		police.shoot(gun);
		Dboss dboss = new Dboss(gun);
		dboss.use();
		Godse godse = new Godse();
		godse.hold();

	}

}
 24 changes: 24 additions & 0 deletions24  
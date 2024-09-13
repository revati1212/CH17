package com.xwork.superchaining;
import com.xwork.superchaining.Goverment;
import com.xwork.superchaining.CentralGoverment;
import com.xwork.superchaining.StateGoverment;

public class GovermentRunner {

	public static void main(String[] args) {
		

			

		StateGoverment stateGoverment = new StateGoverment();
				stateGoverment.display();

				StateGoverment stateGoverment1 = new StateGoverment("Uttar Pradesh","Yogi Adityanath");
				stateGoverment1.display();

				StateGoverment stateGoverment2 = new StateGoverment(222,"Pavan Kalyan");
				stateGoverment2.display();

				CentralGoverment centralGoverment = new CentralGoverment();
				centralGoverment.display();

				CentralGoverment centralGoverment1 = new CentralGoverment("Tamil Nadu","M K Stalin");
				centralGoverment1.display();
				
				CentralGoverment centralGoverment2 = new CentralGoverment(230,"Arvind Kejriwal");
				centralGoverment2.display();

			}

		

	

}

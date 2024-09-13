package com.xwork.superchaining;


	public class StateGoverment extends Goverment {

		public StateGoverment() {
			super("Karnataka",224,"Siddaramaiah","Gangadharaiah Parameshwara");
		}

		public StateGoverment(String state, String homeMinisterName) {
			super(state,homeMinisterName);
		}
		public StateGoverment(int noOfMlas, String partyHeadName) {
			super(noOfMlas,partyHeadName);
			System.out.println("Running StateGovernment in Government with noOfMlas and partyHeadName parameters");

	}

	}


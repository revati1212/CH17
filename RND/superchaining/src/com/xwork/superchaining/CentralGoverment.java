package com.xwork.superchaining;


	public class CentralGoverment extends Goverment {

		public CentralGoverment() {
			super("bijapur",288,"golgumbaz","patil");
		}

		public CentralGoverment(String state, String homeMinisterName) {
			super(state,homeMinisterName);
		}
		public CentralGoverment(int noOfMlas, String partyHeadName) {
			super(noOfMlas,partyHeadName);
			System.out.println("Running CentralGovernment in Government with noOfMlas and partyHeadName parameters");

	}
	}


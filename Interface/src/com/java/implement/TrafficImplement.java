package com.java.implement;

import com.java.Internal.TrafficRule;

public class TrafficImplement implements TrafficRule{

	@Override
	public boolean mustStopAtRedLight() {
		System.out.println("running mustStopAtRedLight ");
		return true;
	}

	@Override
	public boolean mustYieldToPedestrians() {
		System.out.println("running mustYieldToPedestrians ");
		return true;
	}

	@Override
	public boolean canMakeUTurn() {
		System.out.println("running canMakeUTurn ");
		return true;
	}

	@Override
	public boolean mustUseTurnSignals() {
		System.out.println("running mustUseTurnSignals ");
		return true;
	}

	@Override
	public boolean canOvertakeOnSingleLane() {
		System.out.println("running canOvertakeOnSingleLane ");
		return true;
	}

	@Override
	public boolean mustStopAtStopSign() {
		System.out.println("running mustStopAtRedLight ");
		return true;
	}

	@Override
	public boolean mustMaintainDistance() {
		System.out.println("running mustMaintainDistance ");
		return true;
	}

	@Override
	public boolean canParkInNoParkingZone() {
		System.out.println("running canParkInNoParkingZone ");
		return true;
	}

	@Override
	public boolean mustUseHeadlightsInLowVisibility() {
		System.out.println("running  mustUseHeadlightsInLowVisibility ");
		return true;
	}

	@Override
	public boolean canTurnRightOnRed() {
		System.out.println("running canTurnRightOnRed ");
		return false;
	}

	@Override
	public boolean mustGiveWayToEmergencyVehicles() {
		System.out.println("running mustGiveWayToEmergencyVehicles ");
		return false;
	}

	@Override
	public boolean mustComplyWithSchoolZoneSpeedLimit() {
		System.out.println("running mustComplyWithSchoolZoneSpeedLimit ");
		return false;
	}

	@Override
	public boolean canUseHornInResidentialArea() {
		System.out.println("running canUseHornInResidentialArea ");
		return false;
	}

	@Override
	public boolean mustHaveEmissionTestCertificate() {
		System.out.println("running mustHaveEmissionTestCertificate ");
		return false;
	}

	@Override
	public boolean mustFollowRoundaboutRules() {
		System.out.println("running mustFollowRoundaboutRules ");
		return false;
	}

	
}

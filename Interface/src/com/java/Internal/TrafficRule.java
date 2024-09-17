package com.java.Internal;

public interface TrafficRule {
	 boolean mustStopAtRedLight();
	    boolean mustYieldToPedestrians();
	    boolean canMakeUTurn();
	    boolean mustUseTurnSignals();
	    boolean canOvertakeOnSingleLane();
	    boolean mustStopAtStopSign();
	    boolean mustMaintainDistance();
	    boolean canParkInNoParkingZone();
	    boolean mustUseHeadlightsInLowVisibility();
	    boolean canTurnRightOnRed();
	    boolean mustGiveWayToEmergencyVehicles();
	    boolean mustComplyWithSchoolZoneSpeedLimit();
	    boolean canUseHornInResidentialArea();
	    boolean mustHaveEmissionTestCertificate();
	    boolean mustFollowRoundaboutRules();

}

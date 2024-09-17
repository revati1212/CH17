package com.java.interfacerunner;
import com.java.Internal.CollegeRule;
import com.java.Internal.HospitalRule;
import com.java.Internal.RailwayStationRule;
import com.java.Internal.TrafficRule;
import com.java.implement.GovtRule;
import com.java.implement.TempleImplement;
import com.java.implement.TrafficImplement;
import com.java.Internal.TempleRule;
import com.java.implement.RailwayImplement;
import com.java.implement.Collegeimplement;


public class HospitalRunner {

	public static void main(String[] args) {
		HospitalRule hospitalRule=new GovtRule();
		System.out.println("noise:" + hospitalRule.noise());
		System.out.println("mask:" + hospitalRule.mask());
		System.out.println("visitors:" + hospitalRule.visitors());
		
		
		
		        TrafficRule trafficRules =new TrafficImplement ();
		        
		       
		        System.out.println(" red light: " + trafficRules.mustStopAtRedLight());
		        System.out.println(" pedestrians: " + trafficRules.mustYieldToPedestrians());
		        System.out.println("U-turn: " + trafficRules.canMakeUTurn());
		        System.out.println("signals: " + trafficRules.mustUseTurnSignals());
		        System.out.println("overtake: " + trafficRules.canOvertakeOnSingleLane());
		        System.out.println("stop sign: " + trafficRules.mustStopAtStopSign());
		        System.out.println("distance: " + trafficRules.mustMaintainDistance());
		        System.out.println("parking zone: " + trafficRules.canParkInNoParkingZone());
		        System.out.println("headlights: " + trafficRules.mustUseHeadlightsInLowVisibility());
		        System.out.println("right on red: " + trafficRules.canTurnRightOnRed());
		        System.out.println(" emergency vehicles: " + trafficRules.mustGiveWayToEmergencyVehicles());
		        System.out.println("speed limit: " + trafficRules.mustComplyWithSchoolZoneSpeedLimit());
		        System.out.println("horn : " + trafficRules.canUseHornInResidentialArea());
		        System.out.println("certificate: " + trafficRules.mustHaveEmissionTestCertificate());
		        System.out.println(" roundabout rules: " + trafficRules.mustFollowRoundaboutRules());
		        
		        
		        
		        TempleRule templeRule = new TempleImplement();

		        System.out.println("Respectful attire: " + templeRule.Respectfulattire());
		        System.out.println("Quiet behavior: " + templeRule.Quietbehavior());
		        System.out.println("Shoes off: " + templeRule.Shoesoff());
		        System.out.println("Respect rituals: " + templeRule.Respectrituals());
		        System.out.println("No photography: " + templeRule.Nophotography());
		        System.out.println("Offerings: " + templeRule.Offerings());
		        System.out.println("No drinking: " + templeRule.Nodrinking());
		        System.out.println("No smoking: " + templeRule.nosmoking());
		        System.out.println("Phones: " + templeRule.phones());
		        
		        
		        RailwayStationRule rules = new RailwayImplement ();

		        System.out.println("Must have ticket: " + rules.mustHaveTicket());
		        System.out.println("No loud noise: " + rules.noLoudNoise());
		        System.out.println("No eating or drinking: " + rules.noEatingOrDrinking());
		        System.out.println("Wait behind line: " + rules.waitBehindLine());
		        System.out.println("Follow platform signs: " + rules.followPlatformSigns());
		        System.out.println("Keep bags close: " + rules.keepBagsClose());
		        System.out.println("No smoking: " + rules.noSmoking());
		        System.out.println("No running: " + rules.noRunning());
		        System.out.println("Show ID on request: " + rules.showIDOnRequest());
		        System.out.println("No loitering: " + rules.noLoitering());  
		        
		        CollegeRule collegeRules=new Collegeimplement();
		        System.out.println("Must attend classes: " + collegeRules.mustAttendClasses());
		        System.out.println("No smoking on campus: " + collegeRules.noSmokingOnCampus());
		        System.out.println("Follow academic integrity: " + collegeRules.followAcademicIntegrity());
		        System.out.println("Maintain minimum GPA: " + collegeRules.maintainMinimumGPA());
		        System.out.println("No food or drink in classrooms: " + collegeRules.noFoodOrDrinkInClassrooms());
		        System.out.println("Adhere to dress code: " + collegeRules.adhereToDressCode());
		        System.out.println("Participate in group projects: " + collegeRules.participateInGroupProjects());
		        System.out.println("Submit assignments on time: " + collegeRules.submitAssignmentsOnTime());
		        System.out.println("Respect library quiet hours: " + collegeRules.respectLibraryQuietHours());
		        System.out.println("No plagiarism: " + collegeRules.noPlagiarism());
		    }
		
		}
		 
		    
		
		
		

	

package com.java.implement;

import com.java.Internal.RailwayStationRule;

public class RailwayImplement implements RailwayStationRule{
	

	    @Override
	    public boolean mustHaveTicket() {
	        return true;
	    }

	    @Override
	    public boolean noLoudNoise() {
	        return true;
	    }

	    @Override
	    public boolean noEatingOrDrinking() {
	        return false; // Depending on station policy, this might be allowed
	    }

	    @Override
	    public boolean waitBehindLine() {
	        return true;
	    }

	    @Override
	    public boolean followPlatformSigns() {
	        return true;
	    }

	    @Override
	    public boolean keepBagsClose() {
	        return true;
	    }

	    @Override
	    public boolean noSmoking() {
	        return true;
	    }

	    @Override
	    public boolean noRunning() {
	        return true;
	    }

	    @Override
	    public boolean showIDOnRequest() {
	        return true;
	    }

	    @Override
	    public boolean noLoitering() {
	        return true;
	    }
	}




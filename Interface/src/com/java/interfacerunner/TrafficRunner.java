package com.java.trafficrule.runner;

import com.java.Internal.MallRule;
import com.java.Internal.PgRule;
import com.java.Internal.TrafficRule1;
import com.java.implement.CityTraffic;
import com.java.implement.GoldenPg;
import com.java.implement.LulluMall;
import com.java.implement.OrianMall;
import com.java.implement.PriyaPg;
import com.java.implement.WearHelmate;

public class TrafficRunner {

	public static void main(String[] args) {
		MallRule mallRule=new OrianMall();
		LulluMall lulluMall=new LulluMall(mallRule);
		lulluMall.SecurityCheck();
		
		PgRule pgRule = new PriyaPg();
        GoldenPg goldenPg = new GoldenPg(pgRule);
		pgRule.costpermonth();
		
		
		TrafficRule1 trafficRule =new WearHelmate();
		CityTraffic citytraffic=new CityTraffic(trafficRule);
		citytraffic.Vehicles();
		
		
		
	}

}


	



package com.java.provider;

import com.java.Laptops.DellProvider;
import com.java.Laptops.LenovoProvider;
import com.java.internetprovider.AirtelInternetProvider;
import com.java.internetprovider.ExtremeAirtelInternetProvider;
import com.java.internetprovider.InternetProvider;
import com.java.internetprovider.JioProvider;
import com.java.internetprovider.SatjioProvider;


public class ProviderRunner {

	public static void main(String[] args) {
		
		BookingProvider booking1 = new BookingProvider("VRL", "vijaya");
		BookingProvider booking2 = new BookingProvider("SRS", "Ramesh");
		System.out.println(booking1.toString());
		System.out.println(booking2.toString());
		boolean equals = booking1.equals(booking2);
		System.out.println("Booking1 and Booking2 is :" + equals);
		System.out.println("---------------");
		
		MovieBookingProvider movieBooking1 = new MovieBookingProvider("Ashique2", "Shradha kapoor");
		MovieBookingProvider movieBooking2 = new MovieBookingProvider("3 idiots", "Ameer khan");
		System.out.println(movieBooking1.toString());
		System.out.println(movieBooking2.toString());
		boolean equals1 = movieBooking1.equals(movieBooking2);
		System.out.println("movieBooking1 and MovieBooking2" + equals1);
		movieBooking1.book();
		movieBooking1.cancel();
		System.out.println("===========================================");
		
		BookMyShow myShow1 = new BookMyShow("Avengers", "stan lee", 200);
		BookMyShow myShow2 = new BookMyShow("bigtree", "Sharma", 500);
		System.out.println(myShow1.toString());
		System.out.println(myShow2.toString());
		boolean equals2 = myShow1.equals(myShow2);
		System.out.println("myshow1 and myshow2 is:" + equals2);
		myShow1.book();
		myShow1.cancel();
		
		System.out.println("===========================================");
       
		DellProvider dell1 = new DellProvider(" Dell ", "Michael Dell");
		DellProvider dell2 = new DellProvider("XPS Dell", "Michael Dell");
		System.out.println(dell1.toString());
		System.out.println(dell2.toString());
		boolean equals3 = dell1.equals(dell2);
		System.out.println("dell1 and dell2 :" + equals3);
		System.out.println("---------------");
		
		LenovoProvider lenovo1 = new LenovoProvider("Think pad", "liu chuanzhi");
		LenovoProvider lenovo2 = new LenovoProvider("idea pad", "Danny liu ");
		System.out.println(lenovo1.toString());
		System.out.println(lenovo2.toString());
		boolean equals4 = lenovo1.equals(lenovo2);
		System.out.println("lenovo and lenovo2 :" + equals4);
		
		System.out.println("---------------");
		
		InternetProvider internet1 = new InternetProvider("TCP", "OMKAR sir");
		InternetProvider internet2 = new InternetProvider(" fibernet", "HANJI");
		System.out.println(internet1.toString());
		System.out.println(internet2.toString());
		boolean equals5 = internet2.equals(internet1);
		System.out.println("Internet1 and Internet2 :" + equals5);
		internet1.service();
		System.out.println("---------------");
		
		AirtelInternetProvider airtelInternet1 = new AirtelInternetProvider("INTRNET1", "SUHAS");
		AirtelInternetProvider airtelInternet2 = new AirtelInternetProvider("INTERNET2", "HARISH");
		System.out.println(airtelInternet1.toString());
	 System.out.println(airtelInternet2.toString());
		boolean equals6 = airtelInternet1.equals(airtelInternet2);
		System.out.println("airtelInternet1 and airtelInternet2 :" + equals6);
		airtelInternet1.service();
        System.out.println("---------------");
        
     
		
ExtremeAirtelInternetProvider extremeAirtel1 = new ExtremeAirtelInternetProvider("INTERNET3","MAMATA MAM");
ExtremeAirtelInternetProvider extremeAirtel2 = new ExtremeAirtelInternetProvider("INTERNET4","AMIT");
        System.out.println(extremeAirtel1.toString());
		System.out.println(extremeAirtel2.toString());
		boolean equals7 = extremeAirtel2.equals(extremeAirtel1);
		System.out.println("Extreme Airtel1 and Extreme Airtel2 :" + equals7);
		extremeAirtel1.service();

		System.out.println("---------------");
		
		   JioProvider jioprovider1 = new JioProvider("jio sim", "Mukesh Ambani");
			JioProvider jioprovider2 = new JioProvider("jio mart", "neeta Ambani ");
			
			System.out.println(jioprovider1.toString());
			boolean equals8 = jioprovider1.equals(jioprovider2);
			System.out.println("JioInternet1 and JioInternet2 :" + equals8);
			jioprovider1.service();
			System.out.println("---------------");
		
			SatjioProvider satjio1 = new SatjioProvider(20000, "2024-05-15", null);
			SatjioProvider satjio2= new SatjioProvider(40000,"2022-06-10", null);
			
			System.out.println(satjio1.toString());
			boolean equals9 = satjio2.equals(2);
			System.out.println("satjio1 and satjio2 :" + equals9);
			
			System.out.println("---------------");
		
		
       
	}

}

package com.xworks.classcast.runner;
import com.xworks.classcast.Helmate;
import com.xworks.classcast.Country;
public class BulbRunner {

	public static void main(String[] args) {
		 Helmate helmate1 = new Helmate("xyz", "small","red", "gold", 5);
		 Helmate helmate2 = new Helmate("hfyh", "medium","black", "german", 5);
		 helmate1.equals(helmate2);
	        boolean same =helmate1.equals(helmate2);
	        System.out.println("Helmate1 is same as Helmate2:"+same);
	        
	        Country country1 = new Country("india",656677,898, "uuh", "delhi");
			 Country country2 = new Country("pak", 978887,988, "ujyug","kashmir");
			 country1.equals(country2);
		        boolean same1 =country1.equals(country2);
		        System.out.println("Country1 is same as Country2:"+same1);  
	        

	       
	    }
		
	}

	
	

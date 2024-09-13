package com.xworks.classcast;

public class Country {
	
	    private String name;
	    private long population;
	    private double area; 
	    private String continent;
	    private String capital;

	   
	    public Country(String name, long population, double area, String continent, String capitalCity) {
	        this.name = name;
	        this.population = population;
	        this.area = area;
	        this.continent = continent;
	        this.capital = capital;
	    }

	    @Override
	    public String toString() {
	        return "Country [name=" + name + ", population=" + population + ", area=" + area
	                + " sq km, continent=" + continent + ", capital=" + capital + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj != null) {
	            if (obj instanceof Country) {
	                Country country = (Country) obj;
	                System.out.println("Using instanceof to convert subclass type into parent type");

	               
	   if (this.name.equals(country.name) && this.population == country.population &&
	           this.area == country.area &&
	                    this.continent.equals(country.continent) &&
	                    this.capital.equals(country.capital)) {
	                    System.out.println("Checking if the two given refs are equal");
	                    return true;
	                } else {
	                    System.out.println("The given object and this instance are not equal");
	                }
	            } else {
	                System.out.println("The given object is not an instance of Country");
	            }
	        } else {
	            System.out.println("The given object is null");
	        }

	        return super.equals(obj); 
	    }
	}



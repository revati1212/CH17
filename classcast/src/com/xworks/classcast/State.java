package com.xworks.classcast;

public class State {
	

	    private String name;
	    private String abbreviation;
	    private long population;
	    private double area; 
	    private String capitalCity;

	  
	    public State(String name, String abbreviation, long population, double area, String capitalCity) {
	        this.name = name;
	        this.abbreviation = abbreviation;
	        this.population = population;
	        this.area = area;
	        this.capitalCity = capitalCity;
	    }

	    @Override
	    public String toString() {
	        return "State [name=" + name + ", abbreviation=" + abbreviation + ", population=" + population
	                + ", area=" + area + " sq km, capitalCity=" + capitalCity + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj != null) {
	            if (obj instanceof State) {
	                State state = (State) obj;
	                System.out.println("Using instanceof to convert subclass type into parent type");

	               
	                if (this.name.equals(state.name) &&
	                    this.abbreviation.equals(state.abbreviation) &&
	                    this.population == state.population &&
	                    this.area == state.area &&
	                    this.capitalCity.equals(state.capitalCity)) {
	                    System.out.println("Checking if the two given refs are equal");
	                    return true;
	                } else {
	                    System.out.println("The given object and this instance are not equal");
	                }
	            } else {
	                System.out.println("The given object is not an instance of State");
	            }
	        } else {
	            System.out.println("The given object is null");
	        }

	        return super.equals(obj); 
	    }}


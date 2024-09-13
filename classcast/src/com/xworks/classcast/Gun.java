package com.xworks.classcast;

public class Gun {
	
	
	    private String model;
	    private String name;
	    private double length;
	    private String actionType;
	    private int capacity;

	    
	    public Gun(String model, String name, double length, String actionType, int capacity) {
	        this.model = model;
	        this.name = name;
	        this.length = length;
	        this.actionType = actionType;
	        this.capacity = capacity;
	    }

	    @Override
	    public String toString() {
	        return "Gun [model=" + model + ", name=" + name + ", length=" + length
	                + ", actionType=" + actionType + ", capacity=" + capacity + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj != null) {
	            if (obj instanceof Gun) {
	                Gun gun = (Gun) obj;
	                System.out.println("Using instanceof to convert subclass type into parent type");

	               
	                if (this.length == gun.length &&
	                    this.actionType.equals(gun.actionType) &&
	                    this.capacity == gun.capacity) {
	                    System.out.println("Checking if the two given refs are equal");
	                    return true;
	                } else {
	                    System.out.println("The given object and this instance are not equal");
	                }
	            } else {
	                System.out.println("The given object is not an instance of Gun");
	            }
	        } else {
	            System.out.println("The given object is null");
	        }

	        return super.equals(obj);
	    }
	}

package com.xworks.classcast;

public class Bulb {
	

	
	    private String brand;
	    private String type;
	    private double wattage;
	    private String colorTemperature;
	    private boolean isEnergyEfficient;

	    public Bulb(String brand, String type, double wattage, String colorTemperature, boolean isEnergyEfficient) {
	        super();
	        this.brand = brand;
	        this.type = type;
	        this.wattage = wattage;
	        this.colorTemperature = colorTemperature;
	        this.isEnergyEfficient = isEnergyEfficient;
	    }

	    @Override
	    public String toString() {
	        return "Bulb [brand=" + brand + ", type=" + type + ", wattage=" + wattage + ", colorTemperature=" + colorTemperature
	                + ", isEnergyEfficient=" + isEnergyEfficient + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj != null) {
	            if (obj instanceof Bulb) {
	                Bulb bulb = (Bulb) obj;
	                System.out.println("use instanceof to convert subclass type into parent type");

	                if (this.wattage == bulb.wattage && this.colorTemperature.equals(bulb.colorTemperature) &&
	                    this.isEnergyEfficient == bulb.isEnergyEfficient) {
	                    System.out.println("check the two given refs are equal or not");
	                    return true;
	                } else {
	                    System.out.println("obj and this are not equals");
	                }
	            } else {
	                System.out.println("obj is not an instance of Bulb");
	            }
	        } else {
	            System.out.println("obj is null");
	        }

	        return super.equals(obj);
	    }
	}




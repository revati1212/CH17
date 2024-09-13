package com.xworks.classcast;

public class Helmate {
	
	    private String brand;
	    private String size;
	    private String color;
	    private String material;
	    private int safetyRating; 

	    
	 
	    public Helmate(String brand, String size, String color, String material, int safetyRating) {
			super();
			this.brand = brand;
			this.size = size;
			this.color = color;
			this.material = material;
			this.safetyRating = safetyRating;
		}

		

	    @Override
	    public String toString() {
	        return "Helmet [brand=" + brand + ", size=" + size + ", color=" + color
	                + ", material=" + material + ", safetyRating=" + safetyRating + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj != null) {
	            if (obj instanceof Helmate) {
	                Helmate helmate = (Helmate) obj;
	                System.out.println("Using instanceof to convert subclass type into parent type");

	               
	                if (this.brand.equals(helmate.brand) &&
	                    this.size.equals(helmate.size) &&
	                    this.color.equals(helmate.color) &&
	                    this.material.equals(helmate.material) &&
	                    this.safetyRating == helmate.safetyRating) {
	                    System.out.println("Checking if the two given refs are equal");
	                    return true;
	                } else {
	                    System.out.println("The given object and this instance are not equal");
	                }
	            } else {
	                System.out.println("The given object is not an instance of Helmet");
	            }
	        } else {
	            System.out.println("The given object is null");
	        }

	        return super.equals(obj); 
	    }

	    
	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getSize() {
	        return size;
	    }

	    public void setSize(String size) {
	        this.size = size;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getMaterial() {
	        return material;
	    }

	    public void setMaterial(String material) {
	        this.material = material;
	    }

	    public int getSafetyRating() {
	        return safetyRating;
	    }

	    public void setSafetyRating(int safetyRating) {
	        this.safetyRating = safetyRating;
	    }
	}

	  

package com.xworks.classcast;

public class CreditCard {
	
	
	    private String cardNumber;
	    private String holderName;
	    private String bankName;
	    private String type; 
	    private double limit;

	   
	    public CreditCard(String cardNumber, String holderName, String bankName, String type, double limit) {
	        this.cardNumber = cardNumber;
	        this.holderName = holderName;
	        this.bankName = bankName;
	        this.type = type;
	        this.limit = limit;
	    }

	    @Override
	    public String toString() {
	        return "CreditCard [cardNumber=" + cardNumber + ", holderName=" + holderName + ", bankName=" + bankName
	                + ", type=" + type + ", limit=" + limit + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj != null) {
	            if (obj instanceof CreditCard) {
	                CreditCard card = (CreditCard) obj;
	                System.out.println("Using instanceof to convert subclass type into parent type");

	               
	                if (this.cardNumber.equals(card.cardNumber) &&
	                    this.holderName.equals(card.holderName) &&
	                    this.bankName.equals(card.bankName) &&
	                    this.type.equals(card.type) &&
	                    this.limit == card.limit) {
	                    System.out.println("Checking if the two given refs are equal");
	                    return true;
	                } else {
	                    System.out.println("The given object and this instance are not equal");
	                }
	            } else {
	                System.out.println("The given object is not an instance of CreditCard");
	            }
	        } else {
	            System.out.println("The given object is null");
	        }

	        return super.equals(obj); 
	    }

	 
	    public String getCardNumber() {
	        return cardNumber;
	    }

	    public void setCardNumber(String cardNumber) {
	        this.cardNumber = cardNumber;
	    }

	    public String getHolderName() {
	        return holderName;
	    }

	    public void setHolderName(String holderName) {
	        this.holderName = holderName;
	    }

	    public String getBankName() {
	        return bankName;
	    }

	    public void setBankName(String bankName) {
	        this.bankName = bankName;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public double getLimit() {
	        return limit;
	    }

	    public void setLimit(double limit) {
	        this.limit = limit;
	    }
	}


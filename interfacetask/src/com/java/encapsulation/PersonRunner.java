package com.java.encapsulation;

public class PersonRunner {
	
	    public static void main(String[] args) {
	        Person person = new Person("OMKAR", 30);
	        
	        System.out.println("Name: " + person.getName()); 
	        System.out.println("Age: " + person.getAge());   
	        
	        person.setAge(35);
	        System.out.println("Updated Age: " + person.getAge()); 
	        
	     
	    }
	}



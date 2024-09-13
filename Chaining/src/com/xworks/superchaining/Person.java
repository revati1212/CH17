package com.xworks.superchaining;

public class Person {
	
	    private String name;
	    private int age;

	   
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    
	    public Person() {
	        this("Sanji", 23); 
	    }

	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}



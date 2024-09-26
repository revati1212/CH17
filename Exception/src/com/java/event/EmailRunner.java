package com.java.event;

public class EmailRunner {
	public static void main(String[] args) throws InvalidEmailException {
		ServiceEmail serviceEmail=new ServiceEmail();
		serviceEmail.saveEmail("revati@gmail.com");
		ServiceEmail serviceEmail1=new ServiceEmail();
		serviceEmail1.AcceptPrice(400);
	}

}

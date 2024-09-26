package com.java.event;

public class ServiceEmail {
	 public void saveEmail(String invalidEmailException) throws InvalidEmailException {
		System.out.println("checking email");
	
	{
		if(invalidEmailException==null || invalidEmailException.equals ("revati@gmail.com")) {
			System.out.println("valid email");
			
		}
		else {
			System.out.println("invalid email");
			throw new InvalidEmailException(invalidEmailException);
		}
		
}
}
	 public  void AcceptPrice(int invalidAmountException)throws InvalidAmountException
		{
		 System.out.println("checking amount");	
		if(invalidAmountException>1 && invalidAmountException<=500)
		{
			System.out.println("valid amount");
		}
		else {
			System.out.println("invalid amount");
			throw new InvalidAmountException(invalidAmountException);
		}
		}
	}
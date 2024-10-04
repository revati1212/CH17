package com.java.dto;
import com.java.enumkeyword.ProductType;

public class CustomerDTO {

	 String name;
	  String email;
	 ProductType productType;
	
	public  CustomerDTO(String name, String email, ProductType productType) {
		this.name = name;
		this.email = email;
		this.productType = productType;
	}
	

	public String getName() {
		return name;
	}

	
	public String getEmail() {
		return email;
	}

	public ProductType getProductType() {
		return productType;
	}
		public void method1()
		{
			System.out.print("name:"+ getName());
			System.out.print("email:"+ getEmail());
			System.out.print("ProductType:"+ getProductType());
	}
}

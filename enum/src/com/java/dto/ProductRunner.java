package com.java.dto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRunner {

	

	public static void main(String[] args) {
		List<ProductDto>  productDto= new ArrayList<ProductDto>();
		
		 productDto.add(new ProductDto (124,"Revati","wipro",1000)) ;
		 productDto.add(new ProductDto (125,"vicky","hm",2000));
		 productDto.add(new ProductDto (126,"divya","infosys",3000));
		 productDto.add(new ProductDto (127,"lachii","tata",4000));
		 productDto.add(new ProductDto (128,",meghi","airindia",5000));
		 productDto.add(new ProductDto (129,"sanji","flipcart",6000));
		 productDto.add(new ProductDto (130,"priya","amazon",7000));
		 productDto.add(new ProductDto (131,"rohini","meesho",8000));
		 productDto.add(new ProductDto (132,"keerthi","ajio",9000));
		 productDto.add(new ProductDto (133,"akshuu","zara",10000));
		
		
		
	
		//product cost greater than 5000
		  
		 productDto.stream()
         .filter(ProductDto -> ProductDto.getCost() > 5000) 
         .sorted()
         .collect(Collectors.toList()) 
         .forEach(ProductDto -> System.out.println("Sorted in descending order: " + productDto)); 
		 
		 System.out.println("=================");
		 //product cost greater than 5000 & less than 30000
		 productDto.stream()
		 .filter(ProductDto ->ProductDto.getCost()>500 && ProductDto.getCost()<30000)
		  .sorted()
		  .collect(Collectors.toList()) 
		  .forEach(ProductDto -> System.out.println("product: " + productDto)); 
		 System.out.println("=================");
		 
		 //product sort in desc by cost
		 productDto.stream()
		 .sorted((refrence, ref) -> ref.compareTo(refrence))
	        .collect(Collectors.toList())
	        .forEach(ref->System.out.println("Sorted in descending order: " + ref));
		 
		 System.out.println("=================");
		 
		 //product where vendor names starts with A and sort by asc by name
		 productDto.stream()
		  .filter(ProductDto -> ProductDto.getVendor().startsWith("A"))
		  .sorted()
		  .collect(Collectors.toList()) 
		  .forEach(ProductDto -> System.out.println("product: " + productDto)); 
		  
		 System.out.println("=================");
		 //product sort by cost & id
		 productDto.stream()
	      .sorted(Comparator.comparingDouble(ProductDto::getCost).thenComparingInt(ProductDto::getId))
	      .collect(Collectors.toList())
	      .forEach(dto -> System.out.println(dto));
		 System.out.println("=================");
		 
		  //only names from product
		  productDto.stream()
          .map(ProductDto::getName) 
          .forEach(name -> System.out.println("Product Name: " + name));
		  System.out.println("=================");
		  //only id from product

		  productDto.stream()
          .map(ProductDto::getId) 
          .forEach(id -> System.out.println("Product ID: " + id)); 
		  System.out.println("=================");
         //collect product by converting name to uppercase
		  productDto.stream()
          .map(ProductDto -> ProductDto.getName().toUpperCase()) 
          .forEach(name -> System.out.println("Product Name: " + name)); 
		  
		  
         
         
		

	}

}

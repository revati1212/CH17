package com.java.dto;
import com.java.enumkeyword.ProductType;
import com.java.enumkeyword.SeatType;
import com.java.enumkeyword.TicketType;

public class EnumRunner {

	public static void main(String[] args) {
		CustomerDTO customer=new CustomerDTO("REVATI","Revati@gmail.com",ProductType.KITCHEN);
		customer.method1();
		System.out.println("--------------------------");	
		CustomerDTO customer1=new CustomerDTO("divya","divya@gmail.com",ProductType.FURRNITURE);
		customer1.method1();
		System.out.println("--------------------------");
		
		TicketBookDTO ticketBookDTO =new TicketBookDTO("Aashique2","Apsara theatre",
		TicketType.ONLINE,SeatType.PREMIUM);
		ticketBookDTO.information();
		System.out.println("--------------------------");
		TicketBookDTO ticketBookDTO1 =new TicketBookDTO("3 idiots","orian theatre",
		TicketType.OFFLINE,SeatType.EXECUTIVE);
		ticketBookDTO1.information();
	}

}

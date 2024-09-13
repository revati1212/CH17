package java.local.date;

import java.time.LocalDateTime;

public class FutureDateTime {
	public static void main(String[] args) {


		LocalDateTime futureDateTime = LocalDateTime.now().plusDays(5).plusHours(2); 
	        System.out.println("Future DateTime: " + futureDateTime);
	    }

	}



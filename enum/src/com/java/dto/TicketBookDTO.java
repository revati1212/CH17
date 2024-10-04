package com.java.dto;
import com.java.enumkeyword.SeatType;
import com.java.enumkeyword.TicketType;

public class TicketBookDTO {
	
	
	  String movieName;
	 String theaterName;
	 TicketType ticketType;
	 SeatType seatType;
	
	public TicketBookDTO(String movieName, String theaterName, TicketType ticketType, SeatType seatType) {
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.ticketType = ticketType;
		this.seatType = seatType;
	}

	
	public String getMovieName() {
		return movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public SeatType getSeatType() {
		return seatType;
	}


	
	
	public void information()
	{
		System.out.print("moviename:"+ getMovieName());
		System.out.print("moviename:"+ getTheaterName());
		System.out.print("moviename:"+ getTicketType());
		System.out.print("moviename:"+ getSeatType  ());
		
	}

}

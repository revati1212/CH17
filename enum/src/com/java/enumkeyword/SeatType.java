package com.java.enumkeyword;

public enum SeatType {
	RECLINER(102),PREMIUM(567),EXECUTIVE(234);

	int SeatNo;

	private SeatType(int seatNo) {
		SeatNo = seatNo;
	}

	public int getSeatNo() {
		return SeatNo;
	}

	


}

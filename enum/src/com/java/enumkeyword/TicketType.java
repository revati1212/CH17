package com.java.enumkeyword;

public enum TicketType {
	ONLINE(100),OFFLINE(150);
	private int cost;

	private TicketType(int cost) {
		this.cost = cost;
	}
	public int getCost() {
		return cost;
	}

}

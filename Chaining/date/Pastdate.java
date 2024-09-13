package java.local.date;

import java.time.LocalDate;

public class Pastdate {
	public static void main(String[] args) {
		LocalDate pastDate = LocalDate.now().minusDays(5); 
        System.out.println("Past Date: " + pastDate);

	}

}



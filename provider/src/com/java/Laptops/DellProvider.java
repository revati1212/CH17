package com.java.Laptops;
import com.java.provider.Provider;

public class DellProvider extends Provider {
	  

		public DellProvider(String name, String ceo) {
			super(name, ceo);
			System.out.println("Running DellProvider in Provider ");
		}

		@Override
		public void service() {
			System.out.println("Running  Service in DellProvider");

		}

	}



package com.java.Laptops;
import com.java.provider.Provider;


public class LenovoProvider  extends Provider {
	
	

		public LenovoProvider(String name, String ceo) {
			super(name, ceo);
			System.out.println("Running LenovoProvider in Provider ");
		}

		@Override
		public void service() {
			System.out.println("Running Service in LenovoProvider");
		}

	
}

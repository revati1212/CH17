package com.inheritance.bull;

public class bull {

	public class Bull {
		public String location;
		public String color;
		public double weight;
		public int runSpeed;
		public String hornShape;
		public Bull() {
			System.out.println("created non argument bull constructor..");
		}

		public void bullLocation() {
			System.out.println("bull location"+location);
		}

		public void bullColor() {
			System.out.println("bull color"+color);
		}
		public void bullWeight() {
			System.out.println("bull weight"+weight);
		}
		public void bullRunSpeed() {
			System.out.println("bull runSpeed"+runSpeed);
		}
		public void bullHornShape() {
			System.out.println("bull hornShape"+hornShape);
		}}}
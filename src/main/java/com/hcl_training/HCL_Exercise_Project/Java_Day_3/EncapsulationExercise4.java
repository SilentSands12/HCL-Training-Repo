package com.hcl_training.HCL_Exercise_Project.Java_Day_3;

public class EncapsulationExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d = new Dog2();
		// Testing if private fields after getters and setters are good
		System.out.println(d.getFurColor());
		d.setFurColor("Pink");
		System.out.println(d.getFurColor().toString());

		System.out.println(d.makeNoise());
		System.out.println(d.makeNoise("Neeeeeeigh..."));
	}

}

class Animal2 {
	private String furColor = "Brown";

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	int makeNoise() {
		return 1234567890;
	}
}

class Dog2 extends Animal2 {
	String makeNoise(String a) {
		return a;
	}
}

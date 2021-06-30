package com.hcl_training.HCL_Exercise_Project.Java_Day_2;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("George", 2, 22.21);
		Dog d2 = new Dog("Mello", 1);
		Dog d3 = new Dog("Manny");

		// Call toString method on instances
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		System.out.println();

		// Call the methods to see properties
		System.out.println(d1.name + " " + d1.age + " " + d1.weight);
		System.out.println(d2.name + " " + d2.age + " " + d2.weight);
		System.out.println(d3.name + " " + d3.age + " " + d3.weight);
		System.out.println();

		// Show excitement levels
		d1.showExcitement();
		d2.showExcitement(3);
		d3.showExcitement(8);
		System.out.println();

		// Show eating method
		d1.eating();
		d2.eating("chicken.");
		d3.eating("fish.");
	}
}
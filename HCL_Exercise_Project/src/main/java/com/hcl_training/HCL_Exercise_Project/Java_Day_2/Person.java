package com.hcl_training.HCL_Exercise_Project.Java_Day_2;

public class Person {
	// Create variables
	private String name = "John";
	private int age = 25;
	private int shoeSize = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person().startWalking();

	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

	// Walking methods
	private void walking() {
		System.out.print(this.name + " who is " + this.age + " years old and has a shoe size of " + this.shoeSize
				+ " is walking.");
	}

	public void startWalking() {
		walking();
	}
}

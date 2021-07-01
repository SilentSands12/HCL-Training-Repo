package com.hcl_training.HCL_Exercise_Project.Java_Day_2;

public class Dog {
	// Create variables
	String name;
	int age;
	double weight;

	// Multiple Constructors (Overloading)
	public Dog(String name) {
		super();
		this.name = name;
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public Dog(String n, int a, double w) {

		setName(n);
		setAge(a);
		setWeight(w);
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// Override method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		showExcitement();
		return super.toString();
	}

	public void showExcitement() {
		System.out.println(this.getName() + " is wagging its' tail!!!");
	}

	public void showExcitement(int levelOfExcitement) {
		if (levelOfExcitement < 2) {
			System.out.println(this.getName() + " is happy.");
		} else if (levelOfExcitement > 2 && levelOfExcitement < 6) {
			System.out.println(this.getName() + " is very happy.");
		} else if (levelOfExcitement > 5) {
			System.out.println(this.getName() + " is extremely happy.");
		} else {
			System.out.println(this.getName() + " is ...");
		}
	}

	public void eating() {
		System.out.println(this.getName() + " is eating dog food.");
	}

	public void eating(String food) {
		System.out.println(this.getName() + " is eating " + food);
	}

}

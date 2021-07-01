package com.hcl_training.HCL_Exercise_Project.Java_Day_3;

class Cycle {
	String define_me() {
		return "a vehicle with pedals.";

	}
}

class Bike extends Cycle {
	String define_me2() {
		return "a cycle with an engine.";
	}

	Bike() {
		System.out.println("Hello I am a Bike I am " + define_me2());
		String temp = define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}
}

class InheritenceExample1 {
	public static void main(String[] args) {
		Bike M = new Bike();
	}
}

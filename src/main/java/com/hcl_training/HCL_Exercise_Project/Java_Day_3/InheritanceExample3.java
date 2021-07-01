package com.hcl_training.HCL_Exercise_Project.Java_Day_3;

public class InheritanceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.messageForHer();
	}
}

// SuperClass
class A {
	String love = "<3";

	String feelings() {
		return "I care about you.";
	}
}

// Subclass
class B extends A {
	String name = "Jorge";

	void messageForHer() {
		System.out.println("Hi I am " + name + " and " + feelings() + love);
	}
}
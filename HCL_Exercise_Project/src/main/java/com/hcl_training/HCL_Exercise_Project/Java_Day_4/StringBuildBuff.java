package com.hcl_training.HCL_Exercise_Project.Java_Day_4;

public class StringBuildBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String reference variables
		String oneRef = new String();
		String twoRef = new String();

		// String literals
		String one = "cat";
		String two = "cat";

		// Test to see where the reference is pointing to
		System.out.println("Same reference? (one: two) " + (one == two));
		System.out.println("Same reference? (oneRef: one) " + (oneRef == one));
		System.out.println("Same reference? (twoRef: oneRef) " + (twoRef == oneRef));

		System.out.println(); // Division Line 1

		// Reference new String("cat") and see new results
		oneRef = new String("cat");
		System.out.println("Same reference? (oneRef: one) " + (oneRef == one));
		System.out.println("Same reference? (twoRef: oneRef) " + (twoRef == oneRef));

		System.out.println(); // Division Line 2

		// Create new StringBuff/Builder reference variables
		StringBuilder ref1 = new StringBuilder("cat");

		// Reference new String("cat") and see new results
		System.out.println("What is in ref1?: " + ref1);
		ref1.append(" and dog");
		System.out.println("After append? : " + ref1);

	}

}

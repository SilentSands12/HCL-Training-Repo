package com.hcl_training.HCL_Exercise_Project.Java_Day_7;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise4().getNameAge();
	}

	void getNameAge() {
		// Setup scanner to retrieve input and then check age
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name = scan.nextLine();
		int age = 0;
		do {
			try {
				System.out.println("Please enter your age.");
				age = scan.nextInt();
				System.out.printf("\nPlayer name is: %s\nPlayer age is: %d\n", name, age);
				scan.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				scan.next();
			}
		} while (age == 0); // while loop to make sure age asserted and goes to next part of code

		try {
			if (age < 19) {
				throw new CustomException("InvalidAgeRange"); // throws exception if age < 19
			}
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}

@SuppressWarnings("serial")
// Custom made Exception handling class
class CustomException extends Exception {
	String message;

	CustomException(String message) {
		this.message = message;
	}

	public String toString() {
		return message;
	}
}
package com.hcl_training.HCL_Exercise_Project.Java_Day_7;

import java.util.Scanner;

public class ExceptionsExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExceptionsExercise2().validateInputs();

	}

	void validateInputs() {
		// Sample 1
		System.out.println("******** Exception Handling ********");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer. ");
		try {
			int a = scan.nextInt();
			System.out.println("Please enter the second integer. ");
			int b = scan.nextInt();
			System.out.println(a / b);
			System.out.println();
			scan.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println();
		}

	}
}

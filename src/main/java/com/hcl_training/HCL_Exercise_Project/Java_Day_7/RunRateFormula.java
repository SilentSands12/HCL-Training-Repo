package com.hcl_training.HCL_Exercise_Project.Java_Day_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunRateFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunRateFormula().mainCalculation();
	}

	void mainCalculation() {
		// Initialize buffer class object to get user input
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			// Get inputs for the two variables
			System.out.println("Enter the total runs scored.");
			int totalRuns = Integer.parseInt(read.readLine());
			System.out.println("Enter the total overs faced.");
			int totalOvers = Integer.parseInt(read.readLine());

			// Check if variable 2 is 0 to throw exception
			if (totalOvers == 0) {
				throw new ArithmeticException();
			}
			// Use formula to get average of runs/overs and print to user
			double runRate = (double) totalRuns / totalOvers;
			System.out.printf("Current Run Rate: %.2f", runRate);

		} catch (ArithmeticException e) {
			System.out.println(e.getClass());
		} catch (NumberFormatException e) {
			System.out.println(e.getClass());
		} catch (IOException e) {
			System.out.println(e.getClass());
		}
	}
}

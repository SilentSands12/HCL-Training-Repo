package com.hcl_training.HCL_Exercise_Project.Java_Day_5;

import java.util.Scanner;

public class maxCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainCode().getInput();
	}

}

class MainCode {
	void getInput() {
		// Initialize variables and get input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String input = scan.nextLine();
		scan.close();
		mainCodeWork(input);
	}

	void mainCodeWork(String input) {
		// Create char array from input String and create instance variables
		char[] array = input.toCharArray();
		char temp = array[0];
		int repeatAmount = 0, tempAmount = 0, count = 0;

		for (int i = 0; i < array.length; i++) { // keeps track of the index
			for (char j : array) { // gets the amount of repeated times of char
				if (String.valueOf(array[i]).equals(String.valueOf(j))) {
					repeatAmount++;
					if (count == array.length - 1 && repeatAmount > tempAmount) {
						tempAmount = repeatAmount;
						temp = array[i];
						repeatAmount = 0;
					} else if (repeatAmount > tempAmount) {
						tempAmount = repeatAmount;
						temp = array[i];
					} else if (count == array.length - 1) {
						repeatAmount = 0;
					}
				} else if (count == array.length - 1) {
					repeatAmount = 0;
				}
				count++;
				// End of second loop if statement
			}
			count = 0;
		} // End of second loop

		int index = 0, counter = 0;
		for (char k : array) {
			if (String.valueOf(temp).equals(String.valueOf(k))) {
				index = counter;
				break;
			}
			counter++;
		}

		if (tempAmount > 1) {
			System.out.printf("%s was repeated %d times and first occurence was at index %d.", temp, tempAmount, index);

		} else {
			System.out.printf("%s was repeated %d time and first occurence was at index %d.", temp, tempAmount, index);
		}

	}
}
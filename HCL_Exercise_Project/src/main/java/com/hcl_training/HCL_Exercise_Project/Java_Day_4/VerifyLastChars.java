package com.hcl_training.HCL_Exercise_Project.Java_Day_4;

import java.util.Scanner;

public class VerifyLastChars {

	public static void main(String[] args) {
		Main main = new Main();
		main.getInputAndSend();
	}
}

class UserMainCode {

	static int checkCharacters(String input) {
		// Put input string into char[] and then get first and last index
		char[] array = input.toCharArray();
		char first = array[0];
		char last = array[input.length() - 1];

		// Compare the first and last char values and return integer
		if (String.valueOf(first).equals(String.valueOf(last))) {
			return 1;
		} else {
			return -1;
		}
	}
}

class Main {
	void getInputAndSend() {
		// Get scan object initialized and get input string
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word or a sentence.");
		String word = scan.nextLine();
		scan.close();

		// Send the input to the UserMainCode class and print to user
		int result = UserMainCode.checkCharacters(word);
		if (result == 1) {
			System.out.println("Valid.");
		} else {
			System.out.println("Invalid.");
		}
	}
}
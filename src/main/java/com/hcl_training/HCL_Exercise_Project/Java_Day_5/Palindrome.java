package com.hcl_training.HCL_Exercise_Project.Java_Day_5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainCode2().getInput();

		// Testing method #2
		new MainCode2().getInput2();

	}

}

class MainCode2 {
	void getInput() {
		// Initialize variables and get input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String input = scan.nextLine();
		mainCodeWork(input);
	}

	void getInput2() {
		// Initialize variables and get input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String input = scan.nextLine();
		scan.close();
		mainCodeWork2(input);
	}

	void mainCodeWork(String input) {

		// Initialize variables
		int middle;
		char[] array = input.toCharArray();

		// Even side if statement
		if (input.length() % 2 == 0 && input.length() > 1) {
			middle = (input.length() / 2) - 1;
			int middle2 = (input.length() / 2);
			int j = middle2;
			// Start loop to see if chars match from middel to ends
			for (int i = middle; i > -1; i--) {
				if (String.valueOf(array[i]).equals(String.valueOf(array[j]))) {
					j++;
				} else {
					System.out.printf("%s is not a palindrome.\n\n", input);
					break;
				}
				if (i == 0) {
					// Confirms palindrome
					System.out.printf("%s is a palindrome.\n\n", input);
				}
			}
		} else { // Odd side else statement
			if (input.length() > 1) {
				middle = (input.length() / 2);
				int j = middle + 1;
				// Start loop to see if chars match from middle to ends
				for (int i = middle - 1; i > -1; i--) {
					if (String.valueOf(array[i]).equals(String.valueOf(array[j]))) {
						j++;
					} else {
						System.out.printf("%s is not a palindrome.\n\n", input);
						break;
					}
					if (i == 0) {
						// Confirms palindrome
						System.out.printf("%s is a palindrome.\n\n", input);
					}
				}
			} else if (input.length() == 1) {
				System.out.printf("%s is a palindrome.\n\n", input);
			} else {
				System.out.println("Sorry...no characters in the string.");
			}
		}

	}

	void mainCodeWork2(String input) {

		StringBuilder sb = new StringBuilder(input);
		if (input.equals(sb.reverse().toString())) {
			// Confirms palindrome
			System.out.printf("%s is a palindrome.\n\n", input);
		} else {
			System.out.printf("%s is not a palindrome.\n\n", input);
		}

	}
}

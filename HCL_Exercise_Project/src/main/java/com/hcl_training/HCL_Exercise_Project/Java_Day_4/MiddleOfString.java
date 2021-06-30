package com.hcl_training.HCL_Exercise_Project.Java_Day_4;

import java.util.Scanner;

public class MiddleOfString {

	public static void main(String[] args) {
		MainWork.getInput();
	}

}

class MainWork {
	static void getInput() {
		// Initialize scanner object and get input and set to variable
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string. ");
		String input = scan.next();
		scan.close();

		// Call the mainWork method and give string to do the middle search process
		mainWork(input);

	}

	static void mainWork(String n) {
		char middle;
		if (n.length() % 2 == 0 && n.length() > 1) {
			middle = n.charAt(n.length() / 2 - 1);
			char middle2 = (n.charAt((n.length() / 2)));
			System.out.println("The middle characters of '" + n + "' are " + middle + " and " + middle2);
		} else {
			if (n.length() > 0) {
				middle = (n.charAt(n.length() / 2));
				System.out.println("The middle character of '" + n + "' is " + middle);
			} else {
				System.out.println("Sorry...no characters in the string.");
			}
		}
	}
}

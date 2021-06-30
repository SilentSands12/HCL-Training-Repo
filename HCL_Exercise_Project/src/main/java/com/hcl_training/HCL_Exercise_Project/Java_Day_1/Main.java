package com.hcl_training.HCL_Exercise_Project.Java_Day_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			System.out.println(UserMainCode.getLargestWord());
		}
	}

}

class UserMainCode {
	static String getLargestWord() {
		// Get line input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String input = scan.nextLine();

		// Initialize variables to get white spaces
		char[] array = input.toCharArray();
		int j = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				j += 1;
			}
		}

		// Initialize variables
		String[] array2 = new String[j];
		String word = "";
		String tempWord = "";
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				array2[count] = tempWord;
				if (word.length() < tempWord.length()) {
					word = tempWord;
				}
				tempWord = "";
				count++;
			} else if (i == array.length - 1) {
				tempWord += array[i];
				if (word.length() < tempWord.length()) {
					word = tempWord;
				}
				array2[count] = tempWord;
			} else {
				tempWord += array[i];
			}
		}
		return word;
	}
}

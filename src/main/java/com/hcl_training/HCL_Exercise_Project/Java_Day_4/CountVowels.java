package com.hcl_training.HCL_Exercise_Project.Java_Day_4;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		new MainWork();
		// TODO Auto-generated method stub
		MainWork2.getInput();
	}

}

class MainWork2 {
	static void getInput() {
		// Initialize scanner object and get input and set to variable
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string. ");
		String input = scan.nextLine();
		scan.close();

		// Call the mainWork method and give string to do the middle search process
		mainWork(input);

	}

	static void mainWork(String n) {
		char[] array = n.toCharArray();
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		int numberOfVowels = 0;
		
		for (int i = 0; i < array.length; i++) {
			for(int j=0; j< vowels.length; j++) {
				if (array[i] == vowels[j]) {
					numberOfVowels++;
				}
			}
		}
		System.out.println("The number of vowels in the string is " + numberOfVowels);
	}
}
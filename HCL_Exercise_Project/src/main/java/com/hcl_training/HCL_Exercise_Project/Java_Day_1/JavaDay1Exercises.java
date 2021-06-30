package com.hcl_training.HCL_Exercise_Project.Java_Day_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JavaDay1Exercises {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercises().jOptionStuff();
	}
}

class Primitive {

	void printStuff() {
		int x = 0, y = 10, z = 100;
		String one = "Hello ", two = "my ", three = "friend!";

		System.out.print(one + two + three + " Sum of ints are: " + (x + y + z));
	}
}

class Exercises {
	void ifElseStatements() {
		// Initialize variables and get inputs
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value x: ");
		int x = scan.nextInt(); // x variable input

		System.out.println("Please enter value y: ");
		int y = scan.nextInt(); // y variable input

		System.out.println("Please enter value z: ");
		int z = scan.nextInt(); // z variable input

		scan.close();

		// Case #1
		if (x == 2) {
			System.out.println("Condition a true.");
		} else {
			System.out.println("Condition a false.");
		}
		// Case #2
		if (x != 5) {
			System.out.println("Condition b true.");
		} else {
			System.out.println("Condition b false.");
		}
		// Case #3
		if (x != 5 && y >= 5) {
			System.out.println("Condition c true.");
		} else {
			System.out.println("Condition c false.");
		}
		// Case #4
		if (z != 0 || x == 2) {
			System.out.println("Condition d true.");
		} else {
			System.out.println("Condition d false.");
		}
		// Case #5
		if (!(y < 10)) {
			System.out.println("Condition e true.");
		} else {
			System.out.println("Condition e false.");
		}
	}

	void looping() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	void sumNaturals() {
		int sum = 0; // Initialize variable

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	@SuppressWarnings("unused")
	void labledLoop() {

		int age = 10;
		outer: while (age <= 21) {
			inner: while (age <= 21) {
				if (age == 16) {
					System.out.println("Get your driver's license.");
					break inner;
				} else {
					System.out.println("Another year...");
				}
				age++;
			}
			age++;
		}
		System.out.println("You are old enough now!");
	}

	void switchCases() {
		char value = 'b';
		switch (value) {
		case 'a':
			System.out.print("Case 1");
			break;
		case 'b':
			System.out.print("Case 2");
			break;
		case 'c':
			System.out.print("Case 3");
			break;
		default:
			System.out.print("Default case.");

		}
	}

	void commandAndSum() {
		// Get line input
		Scanner scan = new Scanner(System.in);
		String numbers = scan.nextLine();
		scan.close();

		// Initialize variables to get white spaces
		char[] array = numbers.toCharArray();
		int j = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				j += 1;
			}
		}

		// Initialize variables
		String[] array2 = new String[j];
		String word = "";
		int count = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == ' ') {
				array2[count] = word;
				sum += Integer.parseInt(word);
				word = "";
				count++;
			} else if (i == array.length - 1) {
				word += array[i];
				array2[count] = word;
				sum += Integer.parseInt(word);
			} else {
				word += array[i];
			}
		}
		for (String nums : array2) {
			System.out.println(nums);
		}

		System.out.println("The sum of the numbers are: " + sum);
	}

	void printOperations() {
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	}

	void mathArithmetics() {
		int a = 20;
		int b = 4;

		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
	}

	void averageNums() {
		Scanner scan = new Scanner(System.in);
		int a, b, c;

		System.out.print("Enter a number: ");
		a = scan.nextInt();
		System.out.println();

		System.out.print("Enter a number: ");
		b = scan.nextInt();
		System.out.println();

		System.out.print("Enter a number: ");
		c = scan.nextInt();
		System.out.println();

		scan.close();

		int average = (a + b + c) / 3;

		System.out.println("The total average is: " + average);
	}

	void swapVariables() {
		int a = 20;
		int b = 40;

		System.out.println("Before swapping : a, b: " + a + ", " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping : a, b: " + a + ", " + b);
	}

	void primeNum() {
		// Initialize variables and get integer
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int a = scan.nextInt();
		scan.close();

		int count = 0;
		if (a < 2) {
			System.out.println("Int is not a prime number.");
		} else {
			for (int i = 2; i <= a; i++) {
				if (a % i == 0) {
					count++;
					if (count > 1) {
						System.out.println("Int is not a prime number. ");
						break;
					} else if (i == a && count < 2) {
						System.out.println("Congrats!!! The int is a prime number! ");
					}
				}
			}
		}
	}

	void charASCII() {
		char sandra = 'S';

		System.out.print("The ASCII value of '" + sandra + "' is : " + (int) sandra);

	}

	void fizzBubbles() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	void sumOfOdds() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		char[] array = input.toCharArray();
		int sum = 0;

		for (char i : array) {

			if (i % 2 == 1) {
				String changed = String.valueOf(i);
				sum += Integer.parseInt(changed);
			}
		}
		System.out.println("The sum of all the odd digits is: " + sum);
	}

	void sumEvenSquares() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		char[] array = input.toCharArray();
		int sum = 0;

		for (char i : array) {

			if (i % 2 == 0) {
				String changed = String.valueOf(i);
				int allGood = Integer.parseInt(changed);
				sum += (int) Math.pow(allGood, 2);
			}
		}
		System.out.println("The sum of all the even digits is: " + sum);
	}

	void jOptionStuff() {
		String value = JOptionPane.showInputDialog(null, "What is your name? ", "Name Question",
				JOptionPane.OK_CANCEL_OPTION);

		JOptionPane.showMessageDialog(null, "Hello, " + value + ". Nice to meet you!", "Greetings",
				JOptionPane.OK_CANCEL_OPTION);

	}

}
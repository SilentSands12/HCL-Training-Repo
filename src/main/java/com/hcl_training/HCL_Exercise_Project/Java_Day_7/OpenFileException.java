package com.hcl_training.HCL_Exercise_Project.Java_Day_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OpenFileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenFileException exceptions = new OpenFileException();
		exceptions.openingFileBuffered();

		// Call the Scanner method
		exceptions.openingFileScanner();
	}

	void openingFileBuffered() {
		System.out.println("******** Buffered #1 ********");
		String line;
		try { // Opens the file and prints out the txt inside the file
			BufferedReader reading = new BufferedReader(new FileReader("C:\\Users\\jorge_canales\\Sample\\cars.txt"));
			while ((line = reading.readLine()) != null) {
				System.out.println(line);
			}
			reading.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("******** Buffered #2 ********");
		try { // Tries to open the file but print out exception message to user
			BufferedReader reading = new BufferedReader(new FileReader("C:\\Users\\jorge_canales\\Sample\\cars.tx"));
			while ((line = reading.readLine()) != null) {
				System.out.println(line);
			}
			reading.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println();
	}

	void openingFileScanner() {
		System.out.println("******** Scanner #1 ********");
		Scanner input;
		try { // Tries to open file but print out stack exceptions information
			input = new Scanner(new File("foo.txt"));
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // Shows stack trace exceptions
		}

		System.out.println();
		System.out.println("******** Scanner #2 ********");
		try { // Tries to open file but prints out custom message to user with no exception
				// information
			input = new Scanner(new File("foo.txt"));
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File was not found. Please try again. "); // Shows stack trace exceptions
		}

	}

}

package com.hcl_training.HCL_Exercise_Project.Java_Day_8;

import java.io.File;

public class ConstructorFailure {
	File file;

	ConstructorFailure(File file) {
		try {
			if (file == null) {
				throw new CustomException("There was an exception in the first constructor.");
			} else {
				this.file = file;
			}
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorFailure(null);
	}
}

@SuppressWarnings("serial")
class CustomException extends Exception {
	String message;

	CustomException(String message) {
		this.message = message;
	}

	public String toString() {
		return message;
	}
}

package com.hcl_training.HCL_Exercise_Project.Java_Day_8;

import java.io.IOException;

public class ClassExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getExceptionB2();
		} catch (ExceptionB2 e) {
			e.printStackTrace();
		}
		try {
			getNullPointerException();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			getIOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void getExceptionB2() throws ExceptionB2 {
		throw new ExceptionB2("Exception B2");
	}

	static void getNullPointerException() throws NullPointerException {
		throw new NullPointerException("NullPointerException");
	}

	static void getIOException() throws IOException {
		throw new IOException("IOException");
	}

}

class ExceptionA2 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	ExceptionA2(String message) {
		this.message = message;
	}

	public String toString() {
		return message;
	}
}

class ExceptionB2 extends ExceptionA2 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ExceptionB2(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

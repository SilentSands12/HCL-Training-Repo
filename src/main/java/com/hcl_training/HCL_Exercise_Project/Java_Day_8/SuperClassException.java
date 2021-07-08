package com.hcl_training.HCL_Exercise_Project.Java_Day_8;

public class SuperClassException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getExceptionB();
		} catch (ExceptionA e) {
			e.printStackTrace();
		}

		try {
			getExceptionC();
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
	}

	static void getExceptionB() throws ExceptionB {
		throw new ExceptionB("Exception B");
	}

	static void getExceptionC() throws ExceptionC {
		throw new ExceptionC("Exception C");
	}

}

class ExceptionA extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	ExceptionA(String message) {
		this.message = message;
	}

	public String toString() {
		return message;
	}
}

class ExceptionB extends ExceptionA {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ExceptionB(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class ExceptionC extends ExceptionB {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ExceptionC(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

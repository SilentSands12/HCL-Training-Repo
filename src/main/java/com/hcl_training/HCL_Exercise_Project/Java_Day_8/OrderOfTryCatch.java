package com.hcl_training.HCL_Exercise_Project.Java_Day_8;

public class OrderOfTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getSubclassOne();
		} catch (ExceptionOne e) {
			e.printStackTrace();
		}
//		catch (SubclassOne e) {
//			e.printStackTrace();
//		}
		/*
		 * ^ Compiler throws a checked Exception because you cannot put a subclass
		 * exception below a superclass exception. For example, catch Throwable e class
		 * should be declared below a catch Exception e because of class hierarchy
		 */
		try {
			getExceptionOne();
		} catch (ExceptionOne e) {
			e.printStackTrace();
		}
	}

	static void getSubclassOne() throws SubclassOne {
		throw new SubclassOne("Second Exception");
	}

	static void getExceptionOne() throws ExceptionOne {
		throw new ExceptionOne("Main Exception");
	}

}

@SuppressWarnings("serial")
class ExceptionOne extends Exception {
	String message;

	ExceptionOne(String message) {
		this.message = message;
	}

	public String toString() {
		return message;
	}
}

@SuppressWarnings("serial")
class SubclassOne extends ExceptionOne {
	SubclassOne(String message) {
		super(message);
	}
}
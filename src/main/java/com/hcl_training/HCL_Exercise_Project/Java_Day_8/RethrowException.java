package com.hcl_training.HCL_Exercise_Project.Java_Day_8;

public class RethrowException {
	public static void test1() throws Exception {
		System.out.println("The Exception in test1() method");
		throw new Exception("thrown from test1() method");
	}

	public static void test2() throws Throwable {
		try {
			test1();
		} catch (Exception e) {
			System.out.println("Inside test2() method");
			throw e;
		}
	}

	public static void main(String[] args) throws Throwable {
		try {
			test2();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Caught in main");
		}
	}

	/*
	 * Question 7: Is it possible or a good idea to catch an exception in a catch
	 * block and throw a different type of exception?
	 * 
	 * Yes, as you can see the test(2) method in this program can be modified to
	 * throw a NullPointerException instead of rethrowing the exception in test(1).
	 */
}

package com.hcl_training.HCL_Exercise_Project.Java_Day_7;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyCalculator().power(3, 5);
		new MyCalculator().power(2, 4);
		new MyCalculator().power(0, 0);
		new MyCalculator().power(-1, -2);
		new MyCalculator().power(-1, 3);

	}

	public void power(int a, int b) {
		try {
			if (a > 0 && b > 0) {
				System.out.printf("%d\n", (int) Math.pow(a, b));
			} else if (a == 0 && b == 0) {
				throw new Exception("int a and int b should not be zero.\n");
			} else if (a < 0 || b < 0) {
				throw new Exception("int a and int b should not be negative.\n");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}
}

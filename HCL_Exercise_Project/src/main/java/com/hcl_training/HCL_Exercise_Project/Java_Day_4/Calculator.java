package com.hcl_training.HCL_Exercise_Project.Java_Day_4;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculations cal = new Calculations();
		cal.add(2, 4);
		cal.subtract(20, 2);
		cal.multiply(4, 5);
		cal.divide(58, 3);
		cal.exponent(5, 2);
		cal.squareRoot(64);
		
	}

}
class Calculations{
	// Basic +, -, *, and / methods 
	void add(int a, int b) {
		int result = Math.addExact(a, b);
		System.out.printf("%d + %d = %d\n", a,b,result);
	}
	void subtract(int a, int b) {
		int result = Math.subtractExact(a, b);
		System.out.printf("%d - %d = %d\n",a,b,result);
	}
	void multiply(int a, int b) {
		int result = Math.multiplyExact(a, b);
		System.out.printf("%d x %d = %d\n",a,b,result);
	}
	void divide(int a, int b) {
		int result = Math.floorDiv(a, b);
		System.out.printf("%d / %d = %d\n",a,b,result);
	}
	
	// Additional methods
	void exponent(double a, double b) {
		double result = Math.pow(a, b);
		System.out.printf("%1f^%1f = %1f\n", a,b,result);
	}
	void squareRoot(double a) {
		double result = Math.sqrt(a);
		System.out.printf("sqrt of %1f = %1f\n",a,result);
	}
	
}

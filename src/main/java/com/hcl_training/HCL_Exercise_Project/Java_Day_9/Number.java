package com.hcl_training.HCL_Exercise_Project.Java_Day_9;

public class Number implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number one = new Number();
		Thread uno = new Thread(one);
		uno.start(); // Multiples of 2
		
		Number two = new Number();
		Thread dos = new Thread(two);
		dos.start(); // Multiples of 5
		
		Number three = new Number();
		Thread tres = new Thread(three);
		tres.start(); // Multiples of 8
	}

	public void run(int number) {
		// TODO Auto-generated method stub
		System.out.println();
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}

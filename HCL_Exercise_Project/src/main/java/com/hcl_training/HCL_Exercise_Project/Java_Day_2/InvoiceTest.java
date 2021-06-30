package com.hcl_training.HCL_Exercise_Project.Java_Day_2;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String part = "#12345";
		String description = "Hammer";
		int x = 20;
		double y = 5.50;

		System.out.println("Your total price is: " + new Invoice(part, description, x, y).getInvoiceAmount());

	}
}
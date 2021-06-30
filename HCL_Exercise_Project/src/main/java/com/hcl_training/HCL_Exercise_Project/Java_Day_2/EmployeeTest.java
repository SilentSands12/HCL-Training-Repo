package com.hcl_training.HCL_Exercise_Project.Java_Day_2;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create two employee objects
		Employee e1 = new Employee("Jorge", "Canales", 4800.23);
		Employee e2 = new Employee("Sandra", "Lopez", 5500.50);

		// Print out monthly amounts
		System.out.println("Employee 1: " + e1.getFirstName() + " " + e1.getFirstName() + " makes "
				+ e1.getMonthlySalary() + " a month.");
		System.out.println("Employee 2: " + e2.getLastName() + " " + e2.getLastName() + " makes "
				+ e2.getMonthlySalary() + " a month.");
		System.out.println();

		// Print out yearly amounts
		System.out.println("Employee 1: " + e1.getFirstName() + " " + e1.getFirstName() + " makes " + e1.yearlySalary()
				+ " a year.");
		System.out.println("Employee 2: " + e2.getLastName() + " " + e2.getLastName() + " makes " + e2.yearlySalary()
				+ " a year.");
		System.out.println();

		// Give raise to employees
		e1.giveRaise();
		e2.giveRaise();

		// Print out updated yearly amounts
		// Print out yearly amounts
		System.out.println("Employee 1: " + e1.getFirstName() + " " + e1.getFirstName() + " makes " + e1.yearlySalary()
				+ " a year after the raise.");
		System.out.println("Employee 2: " + e2.getLastName() + " " + e2.getLastName() + " makes " + e2.yearlySalary()
				+ " a year after the raise.");
		System.out.println();
	}
}
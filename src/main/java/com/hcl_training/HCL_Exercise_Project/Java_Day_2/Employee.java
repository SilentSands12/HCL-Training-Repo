package com.hcl_training.HCL_Exercise_Project.Java_Day_2;

import java.util.Formatter;

public class Employee {
	// Instance variables
	private String firstName;
	private String lastName;
	private double monthlySalary;

	// Constructor
	public Employee(String first, String last, double salary) {
		this.setFirstName(first);
		this.setLastName(last);
		if (salary > 0) {
			this.setMonthlySalary(salary);
		}
	}

	// Getters and setters methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	// Additional Methods for yearly salary and raise
	public String yearlySalary() {
		double yearlyIncome = this.monthlySalary * 12;
		Formatter formatter = new Formatter();
		formatter.format("%.2f", yearlyIncome);
		String yearly = formatter.toString();
		formatter.close();
		return yearly;
	}

	public void giveRaise() {
		this.monthlySalary = (this.monthlySalary * 0.1) + this.monthlySalary;
	}

}

package com.hcl_training.HCL_Exercise_Project.Java_Day_2;

public class Date {
	int month;
	int day;
	int year;

	// Constructor method
	public Date(int m, int d, int y) {
		setMonth(m);
		setDay(d);
		setYear(y);
	}

	// Setters and Getters
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Additional methods displays
	public void displayDate() {
		String date = this.month + "/" + this.day + "/" + this.year;
		System.out.print("This is the date that we have. " + date);
	}

}

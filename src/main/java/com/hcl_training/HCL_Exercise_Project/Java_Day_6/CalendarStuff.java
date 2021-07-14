package com.hcl_training.HCL_Exercise_Project.Java_Day_6;

import java.util.Calendar;
import java.util.Date;

public class CalendarStuff{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarStuff c = new CalendarStuff();
		// Prints out current time in specified format
		System.out.println(c.giveDate());
		c.extractStuff();
	}
	String giveDate() {
		Calendar cal = Calendar.getInstance();
		String date = cal.getTime().toString();
		return date;
	}
	
	void extractStuff() {
		Date todayDate = new Date();
		System.out.println("Date: " + todayDate);
		System.out.println("Month: " + todayDate.getMonth());
		System.out.println("Day: " + todayDate.getDay());
		System.out.println("Year: " + todayDate.getYear());
		System.out.println("Hours: " + todayDate.getHours());
		System.out.println("Minutes: " + todayDate.getMinutes());
		System.out.println("Seconds: " + todayDate.getSeconds());
	}
	void defaultCalendar() {
		Date todayDate = new Date();
		System.out.println("Date: " + todayDate);
		System.out.println("Month: " + todayDate.getMonth());
		System.out.println("Day: " + todayDate.getDay());
		System.out.println("Year: " + todayDate.getYear());
		System.out.println("Hours: " + todayDate.getHours());
		System.out.println("Minutes: " + todayDate.getMinutes());
		System.out.println("Seconds: " + todayDate.getSeconds());
		
	}
}

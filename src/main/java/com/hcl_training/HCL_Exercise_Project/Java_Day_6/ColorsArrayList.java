package com.hcl_training.HCL_Exercise_Project.Java_Day_6;

import java.util.ArrayList;
import java.util.List;

public class ColorsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		colors(makeArray());
		colorsLoop(makeArray());
		reverseElements(makeArray());
	}

	static List<String> makeArray() {
		// Initialize list and add colors
		List<String> colors = new ArrayList<String>();
		colors.add("blue");
		colors.add("green");
		colors.add("black");
		colors.add("brown");
		colors.add("yellow");
		colors.sort(null);
		return colors;
	}

	static void colors(List<String> array) {
		// Print out strings of colors in the ListArray
		System.out.println("The colors in the list are: " + array);
		System.out.println();
	}

	static void colorsLoop(List<String> array) {
		for (int i = 0; i < array.size(); i++) {
			// Print out strings of colors in the ListArray
			System.out.printf("Color at index %d is %s.\n", i, (array.get(i)));
		}
	}

	static void reverseElements(List<String> array) {
		System.out.println();
		for (int i = array.size() - 1; i > -1; i--) {
			// Print out strings of colors in the ListArray
			System.out.printf("Color at index %d is %s.\n", i, (array.get(i)));
		}
	}
}

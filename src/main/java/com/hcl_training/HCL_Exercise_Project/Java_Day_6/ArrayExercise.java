package com.hcl_training.HCL_Exercise_Project.Java_Day_6;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		for (int i =0; i<2; i++) {
			System.out.println("Please enter 5 integers.");
			for (int j = 0; j < 5; j++) {
				if (i ==0) {
					list1.add(j, scan.nextInt());
				} else {
					list2.add(j, scan.nextInt());
				}
			}
		}
		scan.close();
		new UserMainCode();
		System.out.println(UserMainCode.sortMergedArrayList(list1, list2));

	}

}

class UserMainCode {
	static List<Integer> sortMergedArrayList(List<Integer> one, List<Integer> two) {
		List<Integer> list1 = one;
		List<Integer> list2 = two;
		List<Integer> list3 = new ArrayList<Integer>();

		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);
		for (int i = 0; i < list2.size() - 1; i++) {
			list1.add(list2.get(i));
		}
		list1.sort(null);
		System.out.println("Merged list: " + list1);
		list3.add(list1.get(1));
		list3.add(list1.get(5));
		list3.add(list1.get(7));

		return list3;
	}
}
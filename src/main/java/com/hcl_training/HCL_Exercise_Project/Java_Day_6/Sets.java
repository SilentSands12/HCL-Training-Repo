package com.hcl_training.HCL_Exercise_Project.Java_Day_6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareSets(makeSet());
		lessThanSeven();
	}
	static Set<String> makeSet(){
		Set<String> set = new HashSet<String>();
		set.add("John");
		set.add("Tim");
		set.add("Grainger");
		set.add("Lynette");
		return set;
	}
	static void compareSets(Set<String> set) {
		Set<String> set2 = new HashSet<String>();
		set2.add("Glaly");
		set2.add("Mario");
		set2.add("Tim");
		set2.add("Lynette");
		Set<String> set1 = set;
		
		set1.retainAll(set2);
		System.out.println("The retainable elements in both the sets were: " + set1);
	}
	static void lessThanSeven() {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		TreeSet<Integer> less = new TreeSet<Integer>();
		tree.add(3);
		tree.add(0);
		tree.add(87);
		tree.add(6);
		tree.add(2);
		tree.add(87);

		// My for loop for the problem
//		for (int i =7; i> -1; i--) {
//			if (tree.lower(i) != null) {
//				less.add(tree.lower(i));
//			}
//		}
		
		// Better solution that just used the headSet method call
		less = (TreeSet<Integer>)tree.headSet(7);
		System.out.println("The elements less than 7 in the treeset are: " + less);
	}
}
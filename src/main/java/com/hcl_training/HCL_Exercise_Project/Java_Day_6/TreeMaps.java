package com.hcl_training.HCL_Exercise_Project.Java_Day_6;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
	int favoriteNumber;
	String name;
	
	public Integer getFavoriteNumber() {
		return favoriteNumber;
	}

	public String getName() {
		return name;
	}

	TreeMaps(int num, String name){
		this.favoriteNumber = num;
		this.name = name;
	}

	// override toString method
    public String toString()
    {
        return this.name + ": " + favoriteNumber;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <TreeMaps,Integer> maps = new TreeMap<>(new ComparatorStuff());
		maps.put(new TreeMaps(65,"Jorge"), 34);
		maps.put(new TreeMaps(3,"Victoria"), 22);
		maps.put(new TreeMaps(1,"Juan"), 1);
		maps.put(new TreeMaps(24,"Lynette"), 3);
		maps.put(new TreeMaps(100,"Steven"), 87);
		
		for (Map.Entry<TreeMaps, Integer> entry : maps.entrySet()) {
			System.out.println("Key "+ entry.getKey() + " Value: " + entry.getValue());
		}
	}
	

}
class ComparatorStuff implements Comparator<TreeMaps>{

	public int compare(TreeMaps o1, TreeMaps o2) {
		// TODO Auto-generated method stub
		if (o1.favoriteNumber > o2.favoriteNumber) {
			return 1;
		} else if (o1.favoriteNumber < o2.favoriteNumber) {
			return -1;
		} else {
			return 0;
		}
	}

	
}
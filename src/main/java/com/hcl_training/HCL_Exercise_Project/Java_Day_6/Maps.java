package com.hcl_training.HCL_Exercise_Project.Java_Day_6;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maps map = new Maps();
		map.countMappings(makeMapping());
		map.getMappings(makeMapping());
	}
	static Map<String, String> makeMapping() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("John", "956-352-8940");
		map.put("Jim", "078-222-0000");
		map.put("Sarah", "304-111-9009");
		map.put("Veronica", "116-333-3111");
		map.put("Leticia", "903-444-2456");
		
		return map;

	}	
	void countMappings(Map<String, String> map) {
		System.out.printf("There are '%d' key values in the map.\n",map.size());
	}
	void getMappings(Map<String, String> map) {
		System.out.print("The values inside the map are: " + map.keySet());
	}
}
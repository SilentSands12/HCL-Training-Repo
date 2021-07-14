package com.hcl_training.HCL_Exercise_Project.Java_Day_10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Students implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5941458608871149997L;
	String name;
	int id;
	transient int age;
	
	Students(String n, int r, int c){
		this.name = n;
		this.id = r;
		this.age = c;
	}
	
	public static void main(String[] args) throws IOException {
		readingSerialization();
	}
	static void writingSerialization() {
		try {
			Students one = new Students("Jose", 3332, 13);
			Students two = new Students("Juan", 33222, 3);
			Students three = new Students("Torres", 12332, 78);
			FileOutputStream out = new FileOutputStream("C:\\Users\\jorge_canales\\Sample\\Telephone.txt");
			ObjectOutputStream output = new ObjectOutputStream(out);
			output.writeObject(one);
			output.writeObject(two);
			output.writeObject(three);
			out.close();
			output.close();
			System.out.println("Success.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void readingSerialization() {
		Students two = null;
		Students one = null;
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\jorge_canales\\Sample\\Telephone.txt");
			ObjectInputStream input = new ObjectInputStream(in);
			two = (Students) input.readObject();
			one = (Students) input.readObject();
			System.out.println("Success.");
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(two.name);
		System.out.println(two.id);
		System.out.println(two.age);
		
		System.out.println(one.name);
		System.out.println(one.id);
		System.out.println(one.age);

	}
}

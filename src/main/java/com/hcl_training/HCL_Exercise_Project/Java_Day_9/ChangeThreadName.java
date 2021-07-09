package com.hcl_training.HCL_Exercise_Project.Java_Day_9;

import java.time.Duration;
import java.time.Instant;

public class ChangeThreadName extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeThreadName main = new ChangeThreadName();
		main.setName("Main Thread");
		main.start();
	}

	public void run() {
		System.out.println("My thread is in running state.");
		try {
			// Initialize thread 1 and change name
			Instant start = Instant.now(); // start timer
			Thread t1 = currentThread();
			t1.setName("t1");

			// Print out sleep statement and put thread to sleep for 10 secs
			System.out.printf("%s is going to sleep...zzzZZZ\n", this.getName());
			Thread.sleep(10000);
			/*
			 * If the try{}catch{} block is removed then the compiler throws a
			 * InterruptedException which states if any thread has interrupted the current
			 * thread. The interrupted status of the current thread is cleared when this
			 * exception is thrown.
			 */
			Instant end = Instant.now(); // end timer

			// Print out woke up statement
			long timeElasped = Duration.between(start, end).toSeconds();
			System.out.printf("%s woke up and it took %d seconds.\n", this.getName(), timeElasped);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

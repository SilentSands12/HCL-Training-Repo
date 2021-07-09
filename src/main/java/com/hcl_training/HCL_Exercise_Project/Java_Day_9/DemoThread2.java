package com.hcl_training.HCL_Exercise_Project.Java_Day_9;

public class DemoThread2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread2 demo = new DemoThread2("demo1");
		Thread uno = new Thread(demo);
		uno.start();
		
		DemoThread2 demo2 = new DemoThread2("demo2");
		Thread dos = new Thread(demo2);
		dos.start();
		
		DemoThread2 demo3 = new DemoThread2("demo3");
		Thread tres = new Thread(demo3);
		tres.start();
	}

	DemoThread2(String name) {
		Thread newThread = new Thread();
		newThread.setName(name);
		System.out.printf("%s thread is going through...\n",newThread.getName());
		newThread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Running child Thread '%s' in loop: %d\n",this.getId(),i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

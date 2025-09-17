package com.multithreading;

class MyThread7 extends Thread{
	private String name;
	
	MyThread7(String name){
		this.name = name;
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(name+" is running " +i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(name+ " interrupted");
			}
		}
		System.out.println(name+" finished.!");
	}
}

public class Test7 {
	public static void main(String[] args) {
		Thread t1 = new MyThread7("Thread-1");
		Thread t2 = new MyThread7("Thread-2");
		
		 	t1.start();
	        try {
	            t1.join();  // main thread waits until t1 finishes
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        t2.start();
	        try {
	            t2.join();  // main thread waits until t2 finishes
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread: All threads have finished.");		
	}
}

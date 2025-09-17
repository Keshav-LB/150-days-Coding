package com.multithreading;

	//By extending the thread class
class MyThread extends Thread{
	//work of thread
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Child-thread");
		}
	}

	public void first() {
		System.out.println("          first-method          ");
	}
}
public class Test1 {
	public static void main(String[] args) {
		//Instantiate a thread
		MyThread t = new MyThread();
		
		//start a thread
		t.start();
		t.first();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Parent-thread");
		}
	}
}

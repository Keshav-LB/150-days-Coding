package com.multithreading;

	//By extending the thread class
class MyThread2 extends Thread{
	
	int num;
	MyThread2(int num){
		this.num=num;
	}
	
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("          int-arg method        "+num);
		}
	}
	public void first() {
		System.out.println("          first-method          ");
	}
}
public class Test2 {
	public static void main(String[] args) {
		//Instantiate a thread
		MyThread2 t = new MyThread2(10);
		
		//start a thread
		t.start();
		
		t.first();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Parent-thread");
		}
	}
}

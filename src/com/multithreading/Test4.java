package com.multithreading;

class MyRunnable4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Test4 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());	//main
		
		MyRunnable4 r = new MyRunnable4();
		Thread t = new Thread(r);
		System.out.println(t.getName());	//Thread-0
		
		//set current thread name
		Thread.currentThread().setName("Parent-Thread");
		System.out.println(Thread.currentThread().getName());	//Parent-Thread
		
		t.setName("Child-Thread");
		System.out.println(t.getName());	//Child-thread
		
		System.out.println(t.getId());		//21
		System.out.println(Thread.currentThread().getId());		//1
	}
}

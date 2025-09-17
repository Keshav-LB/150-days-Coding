package com.multithreading;
//	Thread Priority
//	Thread.MAX_PRIORITY - 10 
//	Thread.MIN_PRIORITY - 1 
//	Thread.NORM_PRIORITY- 5
class MyRunnable5 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child-Thread");
	}
	
}

public class Test5 {
	public static void main(String[] args) {
		
		MyRunnable5 r = new MyRunnable5();
		Thread t = new Thread(r);
		
		System.out.println(t.getPriority());	//5
		System.out.println(Thread.currentThread().getPriority());	//5
		
		t.setPriority(4);
		System.out.println(t.getPriority());	//4
		
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority());	//9
	}
}

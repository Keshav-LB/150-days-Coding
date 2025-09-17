package com.multithreading;

class MyRunnable6 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(Thread.currentThread().getName()+" is running "+ i);
			
			//yielding point
			Thread.yield();
		}
	}
	
}
public class Test6 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable6(), "Thread-1");
		Thread t2 = new Thread(new MyRunnable6(), "Thread-2");
		
		t1.setPriority(Thread.NORM_PRIORITY);//5
		t2.setPriority(Thread.NORM_PRIORITY);//5
		
		t1.start();
		t2.start();
	}
}

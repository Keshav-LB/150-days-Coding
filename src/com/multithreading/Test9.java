package com.multithreading;

import java.util.concurrent.CountDownLatch;

public class Test9 {
	public static void main(String[] args) throws InterruptedException{
		CountDownLatch latch = new CountDownLatch(3);
		
		Thread worker = new Thread(() -> {
			try {
				System.out.println("worker waiting ...");
				latch.await();	//wait until count = 0
				System.out.println("worker started !");
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		});
		
		worker.start();
		
		for(int i=3; i>0;i--) {
			Thread.sleep(1000);
			System.out.println("Main reduced latch: "+ i);
			latch.countDown();
		}
	}
}

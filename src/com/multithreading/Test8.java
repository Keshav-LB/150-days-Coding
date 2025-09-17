package com.multithreading;

class MyDaemonThread extends Thread {
	public void run() {
		while (true) {
			System.out.println("Daemon thread running in background...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Daemon interrupted");
			}
		}
	}
}

public class Test8 {
	public static void main(String[] args) {
		MyDaemonThread t = new MyDaemonThread();
		t.setDaemon(true); // make it daemon
		t.start();
		
		//main thread
		for (int i = 1; i <= 3; i++) {
			System.out.println("Main thread work: " + i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
        System.out.println("Main thread finished.");

	}
}

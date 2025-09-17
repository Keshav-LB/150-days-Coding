package com.multithreading;

import java.util.concurrent.CountDownLatch;

class Foo {

	private CountDownLatch latch1; // waits for first()
	private CountDownLatch latch2; // waits for second()

	public Foo() {
		latch1 = new CountDownLatch(1);
		latch2 = new CountDownLatch(1);
	}

	public void first(Runnable printFirst) throws InterruptedException {
		printFirst.run();
		latch1.countDown();// signal that first() is done.
	}

	public void second(Runnable printSecond) throws InterruptedException {
		latch1.await();// wait for first() to finish
		printSecond.run();
		latch2.countDown();// signal that second() is done.
	}

	public void third(Runnable printThird) throws InterruptedException {
		latch2.await();// wait for second() to finish.
		printThird.run();
	}
}

public class PrintOrder {
	public static void main(String[] args) {
		Foo foo = new Foo();

		Thread t1 = new Thread(() -> {
			try {
				foo.first(() -> System.out.print("first"));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(() -> {
			try {
				foo.second(() -> System.out.print("second"));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t3 = new Thread(() -> {
			try {
				foo.third(() -> System.out.print("third"));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();
		t3.start();

	}
}

package com.encora.threads;

public class TablePrinter {
	private static boolean isTableOfTwoPrinted = false;

	public static void main(String[] args) {
		TablePrinter tp = new TablePrinter();
		// t2 thread
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				tp.printTableTwo();
			}
		});
		// t3 thread
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				tp.printTableThree();
			}
		});
		// start of both the threads
		t2.start();
		t3.start();
	}

	public void printTableTwo() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("2 x " + i + " = " + (2 * i));
			}
			isTableOfTwoPrinted = true;
			notify(); // this will notify to the thread 2 which are in waiting state
		}
	}

	public void printTableThree() {
		synchronized (this) {
			try {
				while (!isTableOfTwoPrinted) {
					wait(); // this will wait untill thread 1 execution is not completed
				}
				for (int i = 1; i <= 10; i++) {
					System.out.println("3 x " + i + " = " + (3 * i));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

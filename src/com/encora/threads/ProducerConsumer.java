package com.encora.threads;

import java.util.LinkedList;

public class ProducerConsumer {
	// Size of list is 2.
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;
	// producer thread
	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				// producer thread waits while list is full
				while (list.size() == capacity)
					wait();

				System.out.println("Producer produced-" + value);
				// to insert the item in the list
				list.add(value++);

				// notifies the consumer for consume the item from list
				notify();

				//just to understand the program execution
				Thread.sleep(1000);
			}
		}
	}

	// consumer thread
	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				// consumer thread waits while list is empty
				while (list.size() == 0)
					wait();

				// to retrieve the first job in the list
				int val = list.removeFirst();

				System.out.println("Consumer consumed-" + val);

				// notifies the producer to produce the items 
				notify();

				//just to understand the program execution
				Thread.sleep(1000);
			}
		}
	}
}

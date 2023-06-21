package com.encora.threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		// Create an ExecutorService with a fixed thread pool size
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		// Create a blocking queue to store the data read from the file
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

		// Submit the reader task to the executor service
		executorService.submit(new FileReaderTask(queue));

		// Submit the writer task to the executor service
		executorService.submit(new FileWriterTask(queue));

		// Shutdown the executor service when all tasks are completed
		executorService.shutdown();
	}
}

class FileReaderTask implements Runnable {
	private BlockingQueue<String> queue;

	public FileReaderTask(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				// Add the read line to the queue
				queue.put(line);
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		} finally {
			// Add a sentinel value to the queue to signal the end of reading
			queue.offer("");
		}
	}
}

class FileWriterTask implements Runnable {
	private BlockingQueue<String> queue;

	public FileWriterTask(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
			String line;
			while (true) {
				line = queue.take();
				if (line.isEmpty()) {
					// Reached the end of reading, exit the task
					break;
				}
				// Write the line to the output file
				writer.write(line);
				writer.newLine();
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}

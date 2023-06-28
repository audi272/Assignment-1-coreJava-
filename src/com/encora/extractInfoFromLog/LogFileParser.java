package com.encora.extractInfoFromLog;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogFileParser {
	public static void main(String[] args) {
		// Create a large log file with some NullPointerException traces
		createLogFile("Assignments/src/Files/largeLogFile.log");

		// Parse the log file to extract NullPointerException traces
		parseLogFile("Assignments/src/Files/largeLogFile.log", "Assignments/src/Files/extractedTraces.txt");
	}

	private static void createLogFile(String filePath) {
		try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)))) {
			// Simulating a large log file with random log entries
			for (int i = 0; i < 1000000; i++) {
				String logEntry = generateRandomLogEntry();
				writer.println(logEntry);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String generateRandomLogEntry() {
		// Simulating random log entries
		String[] exceptionClasses = { "NullPointerException", "ArrayIndexOutOfBoundsException",
				"FileNotFoundException" };
		String[] classNames = { "ClassA", "ClassB", "ClassC" };
		String[] methods = { "methodA", "methodB", "methodC" };

		String exceptionClass = exceptionClasses[(int) (Math.random() * exceptionClasses.length)];
		String className = classNames[(int) (Math.random() * classNames.length)];
		String method = methods[(int) (Math.random() * methods.length)];
		String description = "Description of why the exception occurred";
		String logTrace = "Log trace details...";

		return "Exception message: " + exceptionClass + "\n" + "Code Line no: " + generateRandomLineNumber() + "\n"
				+ "Class name: " + className + "\n" + "What method causes: " + method + "\n"
				+ "Description why Exception Occurred: " + description + "\n" + "Log Trace: " + logTrace + "\n";
	}

	private static int generateRandomLineNumber() {
		// Simulating a random line number
		return (int) (Math.random() * 1000) + 1;
	}

	private static void parseLogFile(String sourceFilePath, String targetFilePath) {
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
				PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(targetFilePath)))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("Exception message: NullPointerException")) {
					// Extract the required information and write it to the target file
					String codeLine = br.readLine();
					String className = br.readLine();
					String method = br.readLine();
					String description = br.readLine();
					String logTrace = br.readLine();
					writer.println("Exception message: NullPointerException");
					writer.println("Code Line no: " + extractLineNumber(codeLine));
					writer.println("Class name: " + extractClassName(className));
					writer.println("What method causes: " + extractMethodName(method));
					writer.println("Description why Exception Occurred: " + extractDescription(description));
					writer.println("Log Trace: " + logTrace);
					writer.println();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int extractLineNumber(String codeLine) {
		// Extract the line number from the code line
		String[] parts = codeLine.split(":");
		return Integer.parseInt(parts[1].trim());
	}

	private static String extractClassName(String className) {
		// Extract the class name from the input string
		String[] parts = className.split(": ");
		return parts[1].trim();
	}

	private static String extractFileName(String codeLine) {
		// Extract the file name from the code line
		String[] parts = codeLine.split(":");
		return parts[0].trim();
	}

	private static String extractDescription(String description) {
		// Extract the description from the input string
		String[] parts = description.split(": ");
		return parts[1].trim();
	}

	private static String extractMethodName(String method) {
		// Extract the method name from the input string
		String[] parts = method.split(": ");
		return parts[1].trim();

	}

}

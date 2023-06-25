package com.encora.streamAPI;

public class Department {
	private int id;
	private String name;
	private int employeeId;

	public Department(int id, String name, int employeeId) {
		super();
		this.id = id;
		this.name = name;
		this.employeeId = employeeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}

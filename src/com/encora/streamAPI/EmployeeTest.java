package com.encora.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Company> companiesList = new ArrayList<>();
		companiesList.add(new Company(1, "Infosys", 1));
		companiesList.add(new Company(2, "Encora", 2));
		companiesList.add(new Company(3, "IBM", 3));

		List<Department> departmentList = new ArrayList<>();
		departmentList.add(new Department(1, "Developement", 11));
		departmentList.add(new Department(1, "Developement", 88));
		departmentList.add(new Department(1, "Developement", 33));
		departmentList.add(new Department(2, "Testing", 22));
		departmentList.add(new Department(3, "Maintenace", 66));

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(11, "Ram", "Developer", 8000.00));
		empList.add(new Employee(22, "Shyam", "Developer", 35000.00));
		empList.add(new Employee(66, "John", "Tester", 28000.00));
		empList.add(new Employee(33, "Rahul", "Developer", 25000.00));
		empList.add(new Employee(88, "Nikita", "Manager", 32000.00));

		// Exercise 1 — Obtain a list of Department belongs to Position “Developer” with
		// salary > 10000
		List<String> list = departmentList.stream()
										  .filter(department -> empList.stream().anyMatch(emp -> emp.getPosition().equals("Developer")
										  && emp.getSalary() > 10000 && emp.getId() == department.getEmployeeId()))
										  .map(Department::getName).toList();

		list.forEach(System.out::println);

		// Exercise 2 — Get the cheapest Employee of “Developer” category
		String name = empList.stream()
							 .filter(emp -> emp.getPosition().equals("Developer"))
							 .min(Comparator.comparingDouble(Employee::getSalary)).get().getName();
		System.out.println(name);

		// Exercise 3 — Get the 3 most highest paid Employee
		Employee employee = empList.stream()
								   .sorted(Comparator.comparingDouble(Employee::getSalary)
								   .reversed())
								   .skip(2)
								   .findFirst()
								   .orElse(null);

		System.out.println("3 most highest paid Employee : " + employee.getName());

		// Exercise 4 — Calculate total lump sum salary of Developer” category Employee
		double totalSumOfSalary = empList.stream()
										 .filter(emp -> emp.getPosition().equals("Developer"))
										 .mapToDouble(Employee::getSalary)
										 .sum();
		System.out.println("total lump sum salary of Developer category Employee : " + totalSumOfSalary);

		// Exercise 5 - Get the Department which has most No. of Employees.
		Map<String, Long> map = departmentList.stream()
											  .collect(Collectors.groupingBy(department -> department.getName(), Collectors.counting()));

		String nameOfDeptHavingMaxEmp = map.entrySet().stream()
													  .max(Map.Entry.comparingByValue())
													  .map(Map.Entry::getKey)
													  .orElse(null);
		System.out.println("The Department which has most No. of Employees. " + nameOfDeptHavingMaxEmp);

	}

}

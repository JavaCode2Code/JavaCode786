package com.scjp.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
	static List<Employee> employees = List.of(new Employee(1, "Alice", "IT", 75000, List.of("Cloud", "Security")),
			new Employee(2, "Bob", "IT", 45000, List.of("Legacy System")),
			new Employee(3, "Charlie", "IT", 90000, List.of("Cloud", "AI")),
			new Employee(4, "Diana", "HR", 60000, List.of("Recruiting")),
			new Employee(5, "Evan", "HR", 65000, List.of("Recruiting", "Onboarding")),
			new Employee(6, "Fiona", "Finance", 85000, List.of("Audit")),
			new Employee(7, "George", "Finance", 40000, List.of("Tax")),
			new Employee(7, "Jeen", "Finance", 15000, List.of("Tax")),
			new Employee(7, "Reena", "Finance", 19000, List.of("Tax"))

	);

	public static void main(String[] args) {

		// highest sal based dept
		employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
				.forEach((department, employee) -> {
					// System.out.println("Highest salary in " + department + ": " +
					// employee.get().getName() + " with salary " + employee.get().getSalary());
				});

		// employee who have a salary less then 20000 we have increase by 2000
		List<Double> list2 = employees.stream().filter(e -> e.getSalary() < 20000).map(em -> em.getSalary() + 2000)
				.collect(Collectors.toList());
		System.out.println(list2);

		// max salary employee
		Optional<Employee> salEmp = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(salEmp.get().getSalary());
		
		//min salary emp
		
		Optional<Employee>	minEmp=employees.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
	System.out.println(minEmp.get().getSalary());
	
	}

}
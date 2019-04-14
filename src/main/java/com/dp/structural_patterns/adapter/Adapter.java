package com.dp.structural_patterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Adapter {
	public static void main(String[] args) {
		arraysAdapter();
		employeeClient();
	}
	
	private static void employeeClient() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = new EmployeeDB("sdf", "dfd", "asd");
		employees.add(employee);
		// the following is not possible as ArbeitNehmer has same employee data
		// but with different atributes.
		// In this case adpater is required to convert arbeitnehmer to employee
		// or for mapping atributes
		// Employee employee = new ArbeitNehmer("asd", "sdf", "sdf");
		ArbeitNehmer germanEmployee = new ArbeitNehmer("asd", "sdf", "sdf");
		employees.add(new ArbeitNehmerAdapter(germanEmployee));
		employees.forEach(emp -> {
			System.out.println(emp.getId() + " " + emp.getFName() + " " + emp.getLName());
		});
	}
	
	private static void arraysAdapter() {
		Integer[] arrays = new Integer[] { 4, 3, 4, 3, 2 };
		List<Integer> list = Arrays.asList(arrays);
		System.out.println(arrays);
		System.out.println(list);
	}
}

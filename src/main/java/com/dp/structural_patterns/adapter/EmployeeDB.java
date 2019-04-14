package com.dp.structural_patterns.adapter;

public class EmployeeDB implements Employee {
	private String id;
	private String fName;
	private String lName;
	
	public EmployeeDB(String id, String fName, String lName) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}
	
	public String getId() {
		return id;
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
}

package com.dp.creational_patterns.factory;

public class SqlDB implements DBConnection{

	public void connect() {
		System.out.println("Connecting to SQL....");
	}

}

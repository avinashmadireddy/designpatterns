package com.dp.creational_patterns.factory;

public class MongoDB implements DBConnection{

	public void connect() {
		System.out.println("Connecting to MongoDB....");
	}
	

}

package com.dp.structural_patterns.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Bridge {
	public static void main(String[] args) {
		jdbc();
	}
	
	private static void jdbc() {
		DriverManager.registerDriver(new EmbeddedDriver());
		String dbUrl = "";
		Connection conn = DriverManager.getConnection(dbUrl);
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("create table address(id int, name varchar(20)");
		System.out.println("table created");
	}
}

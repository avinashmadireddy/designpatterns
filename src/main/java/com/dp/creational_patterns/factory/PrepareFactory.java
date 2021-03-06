package com.dp.creational_patterns.factory;

public class PrepareFactory {
	public static String MONGO = "MONGO";
	public static String SQL = "SQL";

	public DBConnection getConnection(String dbType) {
		if (MONGO.equals(dbType))
			return new MongoDB();

		if (SQL.equals(dbType))
			return new SqlDB();

		return null;
	}
}

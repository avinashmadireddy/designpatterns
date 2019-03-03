package com.dp.creational_patterns.factory;

public class FactoryPattern {
	public static void main(String[] args) {
		connectMongo();

		connectSQL();
	}

	private static void connectSQL() {
		DBConnection sql = PrepareFactory.getConnection(PrepareFactory.SQL);
		sql.connect();
	}

	private static void connectMongo() {
		DBConnection mongo = PrepareFactory.getConnection(PrepareFactory.MONGO);

		mongo.connect();
	}
}

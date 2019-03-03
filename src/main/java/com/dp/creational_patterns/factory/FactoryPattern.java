package com.dp.creational_patterns.factory;

public class FactoryPattern {
	public static void main(String[] args) {
		PrepareFactory factory = new PrepareFactory();
		
		connectMongo(factory);

		connectSQL(factory);
	}

	private static void connectSQL(PrepareFactory factory) {
		DBConnection sql = factory.getConnection(PrepareFactory.SQL);
		sql.connect();
	}

	private static void connectMongo(PrepareFactory factory) {
		DBConnection mongo = factory.getConnection(PrepareFactory.MONGO);
		mongo.connect();
	}
}

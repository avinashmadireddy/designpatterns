package com.dp.creational_patterns.prototype;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		ConstructCache.load();

		Circle circle = (Circle) ConstructCache.getShare("1");
		System.out.println(circle.getType());

		Square square = (Square) ConstructCache.getShare("2");
		System.out.println(square.getType());

	}

}

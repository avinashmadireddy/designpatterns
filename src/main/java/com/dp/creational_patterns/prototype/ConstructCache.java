package com.dp.creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class ConstructCache {

	private static Map<String, Shape> cache = new HashMap<String, Shape>();

	public static Shape getShare(String id) throws CloneNotSupportedException {
		Shape shape = cache.get(id);
		return (Shape) shape.clone();
	}

	public static void load() {
		Circle circle = new Circle();
		circle.setId("1");
		cache.put("1", circle);

		//
		Square square = new Square();
		square.setId("2");
		cache.put("2", square);
	}

}

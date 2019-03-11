package com.dp.creational_patterns.builder;

public class Builder1 {
	public static void main(String[] args) {
		{
			// problem with this is luchOrder is mutable, means values can be
			// overridder
			// after object creation using setters. Using Telescoping
			// constructors
			// this problems can be resolved
			LunchOrderBean1 lunchOrder = new LunchOrderBean1("xyz", "Sdf", "dr", "dfs");
			System.out.println(lunchOrder.getBread());
			System.out.println(lunchOrder.getCondiments());
			System.out.println(lunchOrder.getDressing());
			System.out.println(lunchOrder.getMeat());
		}
		{
			// using telescoping constructors
		}
	}
	// StrinBuilder is an example of builder pattern
}

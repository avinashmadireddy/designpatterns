package com.dp.creational_patterns.builder;

import com.dp.creational_patterns.builder.LunchOrderBean2.Builder;

public class Builder2 {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.bread("Sdf").meat("dsf").dressing("Sdf").condiments("Sdf");
		LunchOrderBean2 lunchOrder = builder.build();
		//
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getMeat());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
	}
}

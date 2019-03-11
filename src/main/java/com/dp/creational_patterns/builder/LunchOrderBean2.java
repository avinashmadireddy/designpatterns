package com.dp.creational_patterns.builder;

public class LunchOrderBean2 {
	public static class Builder {
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public LunchOrderBean2 build() {
			return new LunchOrderBean2(this);
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
		
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}
	
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrderBean2(Builder build) {
		this.bread = build.bread;
		this.condiments = build.condiments;
		this.dressing = build.dressing;
		this.meat = build.meat;
	}
	
	public String getBread() {
		return bread;
	}
	
	public String getCondiments() {
		return condiments;
	}
	
	public String getDressing() {
		return dressing;
	}
	
	public String getMeat() {
		return meat;
	}
}

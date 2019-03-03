package com.dp.creational_patterns.singleton;

public class SingletonPattern {
	public static void main(String[] args) {
		SingletonObject instance = SingletonObject.getInstance();
		instance.showMessage();
	}
	
	//singleton, prototype, request, session, global-session : spring prototypes
}

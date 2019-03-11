package com.dp.creational_patterns.singleton;

public class SingletonObject {
	// volatile : thread safe. not to make any changes inside the JVM
	private static volatile SingletonObject instance = null;// new
															// SingletonObject();
	
	public SingletonObject() {
		// thread safe
		if (instance != null)
			throw new RuntimeException("use getInstance() method");
	}
	
	public static SingletonObject getInstance() {
		if (instance == null) {// lazy loading;
			synchronized (SingletonObject.class) {// thread safe
				if (instance == null) {
					instance = new SingletonObject();
				}
			}
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Singleton");
	}
}

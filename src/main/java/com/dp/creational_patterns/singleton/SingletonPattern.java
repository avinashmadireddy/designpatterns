package com.dp.creational_patterns.singleton;

public class SingletonPattern {
	public static void main(String[] args) {
		SingletonObject instance = SingletonObject.getInstance();
		instance.showMessage();
		//

		Runtime runtime = Runtime.getRuntime();
//		

		Runtime anotherRuntime = Runtime.getRuntime();
//		
		if (runtime == anotherRuntime)
			System.out.println("same instances");
	}

	// singleton, prototype, request, session, global-session : spring prototypes
}

package com.app.test;

public class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			saveData();
			if (i == 5) {
				System.out.println("print the updated values:" + i);
			} else {
				System.out.println("continue the values:" + i);
			}

		}
	}

	public static void saveData() {
		System.out.println("Hello");
	}

}

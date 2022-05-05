package com.functional.example;

public class Test {
	public static void main(String [] args) {
		new  Thread(new Runnable() {
			public void run() {
				System.out.println("functional interface example");
			}
		}).start();
	}

}

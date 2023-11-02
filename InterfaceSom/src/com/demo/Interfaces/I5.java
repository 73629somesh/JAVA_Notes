package com.demo.Interfaces;

public interface I5 {
	void f51();
	public static void f52() {
		System.out.println("In Static f52 ");
	}
		default void f53() {
			System.out.println("in default f53");
		}
}

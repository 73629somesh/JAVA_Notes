package com.demo.Interfaces;

public interface I4 {
	int i=22;
	public static void f41() {
		System.out.println("In static f41 ");
	}
	 default void f42() {
		System.out.println("In default f42 ");
	}
}

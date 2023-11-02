package com.demo.beans;
import com.demo.Interfaces.I3;
import com.demo.Interfaces.I4;
public class Class1 implements I3,I4{
	public void f11() {
		System.out.println("in f11 ");
	}
	public void f12() {
		System.out.println("in f12 ");
	}
	@Override
	public void f21() {
		System.out.println("in f21 ");
		
	}
	@Override
	public int f22() {
		System.out.println("in f22 ");
		return 0;
	}
	@Override
	public void f31() {
		
		System.out.println("in f31 ");
	}
	@Override
	public void f32() {
		System.out.println("in f32 ");
		
	}
	
}

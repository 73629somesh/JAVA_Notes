package com.demo.Test;
import com.demo.Interfaces.I1;
import com.demo.Interfaces.I2;
import com.demo.Interfaces.I3;
import com.demo.Interfaces.I4;
import com.demo.beans.Class1;
public class TestMain {

	public static void main(String[] args) {
		
		I1 Cb=new Class1();//or
		//Class1 Cb=new Class1();
		Cb.f11();
		System.out.println(I4.i);;
		I4.f41();
		Class1 Cc=new Class1();
		Cc.f42();
		I2.f23();
		
	}

}

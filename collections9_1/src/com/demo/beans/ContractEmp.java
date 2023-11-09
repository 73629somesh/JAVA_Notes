package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee{
	private int hrs;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int pid, String pname, String mobile, String email,String dept, String desg, LocalDate doj,int hrs, double charges) {
		super(pid,pname,mobile,email,dept,desg,doj);
		this.hrs = hrs;
		this.charges = charges;
	}
	public ContractEmp(int id) {
		super(id);
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	@Override
	public String toString() {
		return super.toString()+"ContractEmployee [hrs=" + hrs + ", charges=" + charges + "]\n";
	}
	@Override
	public double calculateSal() {
		System.out.println("in calculate sal contract");
		return 0;
	}
	
	

}

package com.demo.beans;


public class Person implements Comparable<Employee>{
	private int pid;
	private String pname;
	private String mobile;
	private String email;
	public Person() {
		System.out.println("in person default constructor");
		
	}
	public Person(int pid, String pname, String mobile, String email) {
		System.out.println("in person paremterised  constructor");
		this.pid = pid;
		this.pname = pname;
		this.mobile = mobile;
		this.email = email;
	}
	public Person(int id) {
		this.pid=id;
	}
	
	public boolean equals(Object ob) {
		return this.pid==((Person)ob).pid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + ", email=" + email + "]";
	}
	public int compareTo(Employee o) {
		return this.pname.compareTo(((Person)o).pname);
	}
	
	
	
	
	
	
	
	
	
	}



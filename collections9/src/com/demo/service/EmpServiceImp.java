package com.demo.service;

import com.demo.dao.EmpDaoImp;
import com.demo.dao.EmployeeDao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.ContractEmp;

public class EmpServiceImp implements EmployeeService{
	
	private EmployeeDao edao;

	public EmpServiceImp(){
		edao=new EmpDaoImp();
	}
	
	public void addNewEmp(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		System.out.println("enter date of joining(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("DD/MM/YYYY"));
		
		Employee e=null;
		if(ch==1) {
			System.out.println("Enter The salary");
			double s=sc.nextDouble();
			System.out.println("enter bonus");
			double b=sc.nextDouble();
			e=new SalariedEmp(pid, nm, mob, em, dept, desg, ldt, s, b);
		}
			else if(ch==2) {
				System.out.println("Enter The Hours");
				int hr=sc.nextInt();
				System.out.println("Enter The Charges");
				int chr=sc.nextInt();
				e=new ContractEmp(pid, nm, mob, em, dept, desg, ldt, hr,chr);
				
				
			}
		edao.save(e);
		
	}
	
	public boolean deleteById(int did) {
		return edao.removeById(did);
	}
	
	public boolean modifyBySal(int id,double sal) {
		return edao.updateBySal(id,sal);
	}

}

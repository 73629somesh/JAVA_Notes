package com.demo.service;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.ContractEmp;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmpDaoImp;
import java.util.Date;
import java.util.Set;

public class EmpServiceImp implements EmployeeService{
	EmployeeDao edao=new EmpDaoImp();
	public void addNewEmployee() {
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
		
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=null;
		System.out.println("1.Salaried Employee\n2.Contract Employee");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Enter the salary");
			double sal=sc.nextDouble();
			System.out.println("Enter the Bonus");
			double bs=sc.nextDouble();
			e=new SalariedEmp(pid,nm,mob,em,dept,desg,ldt,sal,bs);
			}
			else if(ch==2) {
				System.out.println(" Enter Hours");
				int hr=sc.nextInt();
				System.out.println("Enter the Charges");
				Double chr=sc.nextDouble();
				e=new ContractEmp(pid,nm,mob,em,dept,desg,ldt,hr,chr);
			}
			edao.save(e);
		
	}
	
	public boolean deleteEmpById(int id) {
		System.out.println("in empservice deletebyid");
		return edao.removeById(id);
	}
	
	public boolean modifySal(int id1,Double sal1) {
		return edao.updateSal(id1,sal1);
	}
	
	public Set<Employee> displayAll() {
		return edao.getAll();
	}
	
	public Employee displayById(int id) {
		return edao.getById(id);
	}
	
	public Set<Employee> sortBySal(){
		return edao.sortBySalary();
	}
	
	public Set<Employee> sortByName(){
		return edao.sortBynm();
	}
	
	public Set<Employee> getTopNEmp(int n){
		return edao.getNEmp(n);
	}
}
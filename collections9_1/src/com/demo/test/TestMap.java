package com.demo.test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import com.demo.beans.Employee;
import java.util.List;

import com.demo.service.EmpServiceImp;
import com.demo.service.EmployeeService;

public class TestMap {

	public static void main(String[] args) {
		
		EmployeeService eservice=new EmpServiceImp();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.Add New Employee\n2.Delete Employee By Id\n3.Modify Salary\n4.Display All\n5.Display By Id");
			System.out.println("6.Sort By Salary\n7.Sort By Id");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("1.SalariedEmp\n2.ContractEmp");
				int ch=sc.nextInt();
				eservice.addNewEmp(ch);
				break;
				
			case 2:
				System.out.println("Enter Id for Deletion");
				int id=sc.nextInt();
				boolean status=eservice.deleteById(id);
				if(status) {
					System.out.println("Deleted Successfully");
				}
				else {
					System.out.println("Deletion failed");
				}
				break;
			case 3:	
				System.out.println("Enter Id for Modify Sal");
				id=sc.nextInt();
				System.out.println("Enter Salary ");
				double sal=sc.nextDouble();
				status=eservice.modifyBySal(id,sal);
				if(status) {
					System.out.println("Modify Successfully");
				}
				else {
					System.out.println("Modification failed");
				}
				break;
			case 4:
					eservice.displayAll();
				break;
			case 5:
				System.out.println("Enter the Id for Display");
				id=sc.nextInt();
				Employee e=eservice.displayById(id);
				if(e!=null) {
					System.out.println(e);
				}
				break;
			case 6:
				List<Employee> elst=eservice.sortBySalary();
				elst.stream().forEach(System.out::println);
				break;
//			case 7:
//				TreeMap<Integer,Employee> tm=new TreeMap<>();
////				tm=eservice.sortById();
//				Set<Integer> hs=tm.keySet();
//				for(Integer ob:hs) {
//					System.out.println(tm.get(ob));
//				}
//				break;
			}
			
			
			 
		}while(choice!=5);
	}

}

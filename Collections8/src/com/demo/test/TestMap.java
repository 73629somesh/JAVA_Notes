package com.demo.test;
import java.util.Scanner;
import com.demo.service.EmployeeService;
import com.demo.service.EmpServiceImp;
import java.util.Set;

import com.demo.beans.Employee;

public class TestMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmpServiceImp();
		int choice=0;
		do {
			System.out.println("1.Add New Employee\n 2.Delete Employee By ID\n 3.Modify Salary\n4.Display All\n5.Display By Id");
			System.out.println("6.Sort by sal\n7.Sort by name\n8.Display n top most based on salary ");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				eservice.addNewEmployee();
				break;
				
			case 2:
				System.out.println("Enter Id for Deletion ");
				int id=sc.nextInt();
				boolean status=eservice.deleteEmpById(id);
				if(status) {
					System.out.println("Deleted Successfully");
				}
					else {
						System.err.println("Deletion Failed");
					}
					break;
					
			case 3:
				System.out.println("Enter Id for Modification ");
				int id1=sc.nextInt();
				System.out.println("Enter Salary for modification");
				Double sal1=sc.nextDouble();
				status=eservice.modifySal(id1,sal1);
				
			case 4:
				Set<Employee> eset=eservice.displayAll();
				if(eset!=null) {
					eset.stream().forEach(System.out::println);
				}
				else {
					System.out.println("Not Found");
				}
				break;
			case 5:
				System.out.println("Enter Id for Display");
				id=sc.nextInt();
				Employee e=eservice.displayById(id);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Id not Found");
				}
				break;
			
			case 6:
				Set<Employee> esset=eservice.sortBySal();
				
				esset.stream().forEach(System.out::println);
				break;
				
			case 7:
				esset=eservice.sortByName();	
				esset.stream().forEach(System.out::println);
				break;
				
			case 8:
				System.out.println("Enter the top n employees u wnt by salary");
				int n=sc.nextInt();
				esset=eservice.getTopNEmp(n);
				esset.stream().forEach(System.out::println);
				
			}
		}while(choice!=9);
	}

}



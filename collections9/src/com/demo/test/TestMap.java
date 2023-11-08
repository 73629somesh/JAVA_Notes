package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmpServiceImp;
import com.demo.service.EmployeeService;

public class TestMap {

	public static void main(String[] args) {
		
		EmployeeService eservice=new EmpServiceImp();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.Add New Employee\n2.Delete Employee By Id\n3.Modify Salary");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("1.SalariedEmp\n2.ContractEmp");
				int ch=sc.nextInt();
				eservice.addNewEmp(ch);
				
				
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
			}
			
			 
		}while(choice!=5);
	}

}

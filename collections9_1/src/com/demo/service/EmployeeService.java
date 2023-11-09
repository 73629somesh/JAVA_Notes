package com.demo.service;
import java.util.List;
import java.util.TreeMap;

import com.demo.beans.Employee;


public interface EmployeeService {

	void addNewEmp(int ch);
	boolean deleteById(int did);
	boolean modifyBySal(int id,double sal);
	void displayAll();
	Employee displayById(int id);
	List<Employee> sortBySalary();
//	TreeMap<Integer,Employee> sortById();
}

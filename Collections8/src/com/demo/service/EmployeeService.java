package com.demo.service;
import java.util.Set;
import com.demo.beans.Employee;
public interface EmployeeService {
	void addNewEmployee();
	boolean deleteEmpById(int id);
	boolean modifySal(int id1,Double sal1);
	Set<Employee> displayAll();
	Employee displayById(int id);
	Set<Employee> sortBySal();
	Set<Employee>sortByName();
	Set<Employee> getTopNEmp(int n);
}

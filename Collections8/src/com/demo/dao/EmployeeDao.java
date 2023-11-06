package com.demo.dao;
import com.demo.beans.Employee;
import java.util.Set;

public interface EmployeeDao {
	
	void save(Employee e);
	boolean removeById(int id);
	boolean updateSal(int id1,Double sal1);
	Employee getById(int id);
	Set<Employee> getAll();
	Set<Employee> sortBySalary();
	Set<Employee> sortBynm();
	Set<Employee> getNEmp(int n);
}

package com.demo.dao;
import com.demo.beans.Employee;
import java.util.List;
import java.util.TreeMap;

public interface EmployeeDao {
	
	void save(Employee e);
	boolean removeById(int did);
	boolean updateBySal(int id,double sal);
	void getAll();
	Employee getById(int id);
	List<Employee> sortBySal();
//	TreeMap<Integer, Employee> sortId();

}




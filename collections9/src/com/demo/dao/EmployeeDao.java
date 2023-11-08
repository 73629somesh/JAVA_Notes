package com.demo.dao;
import com.demo.beans.Employee;

public interface EmployeeDao {
	
	void save(Employee e);
	boolean removeById(int did);
	boolean updateBySal(int id,double sal);

}

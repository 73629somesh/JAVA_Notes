package com.demo.dao;
import java.util.Map;
import java.util.HashMap;
import com.demo.beans.SalariedEmp;
import com.demo.beans.ContractEmp;
import java.time.LocalDate;



import java.util.HashMap;

import com.demo.beans.Employee;




public class EmpDaoImp implements EmployeeDao {
	
	static Map<Integer,Employee> hm;
	static {
		hm=new HashMap<>();
		hm.put(12,new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		hm.put(13,new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		hm.put(14,new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		hm.put(15,new ContractEmp(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
	}

	
	public void save(Employee e) {
		if(!hm.containsKey(e.getPid())) {
			hm.put(e.getPid(), e);
		}
	}
	
	public boolean removeById(int did) {
		Employee e=hm.remove(did);//by getting key 'remove()' sends value to employee obj 'e';
		if(e!=null) {
			return true;
		}
		return false;
	}
	
	public boolean updateBySal(int id,double sal) {
		Employee e=hm.get(id);
		
		if(e!=null) {
			if(e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(sal);
			}
			else if(e instanceof ContractEmp) {
				((ContractEmp) e).setCharges(sal);
		}
			return true;
		}else {
			return false;
		}
	}
}
	
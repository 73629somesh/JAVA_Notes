package com.demo.dao;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.HashMap;
import com.demo.beans.SalariedEmp;
import com.demo.beans.ContractEmp;
import java.time.LocalDate;
import java.util.Set;




import java.util.HashMap;

import com.demo.beans.Employee;
import java.util.Comparator;




public class EmpDaoImp implements EmployeeDao {
	
	static Map<Integer,Employee> hm;
	static {
		hm=new HashMap<>();
		hm.put(13,new SalariedEmp(13,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		hm.put(15,new SalariedEmp(15,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		hm.put(14,new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		hm.put(12,new ContractEmp(12,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
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
	@Override
	public void getAll() {
		
		System.out.println(hm.values());
	}
	
	public Employee getById(int id) {
		return hm.get(id);
	}

	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> c=(o1,o2)-> {
			double sal1=0,sal2=0;
			if(o1 instanceof SalariedEmp) {
				sal1=((SalariedEmp)o1).getSal();
			}
			else if(o1 instanceof ContractEmp) {
				sal1=((ContractEmp)o2).getCharges();
			}
			else {
				
			}
			if(o2 instanceof SalariedEmp) {
				sal2=((SalariedEmp)o2).getSal();
			}
			else if(o2 instanceof ContractEmp) {
				sal2=((ContractEmp)o2).getCharges();
			}
			else {
				
			}
			return (int)(sal1-sal2);
		};
		List<Employee> els=(List<Employee>)hm.values();
		els.sort(c);
		return els;
	}

//	@Override
//	public TreeMap<Integer, Employee> sortId() {
//			TreeMap<Integer,Employee> ts=new TreeMap<>();
//			Set<Integer> hs=hm.keySet();
//			for(Integer ob:hs) {
//				ts.put(ob,hm.get(ob));
//			}
//			return ts;
//	}
}
	
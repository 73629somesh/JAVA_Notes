package com.demo.dao;
import java.util.HashSet;
import java.util.Set;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.ContractEmp;
import java.time.LocalDate;
import java.util.Date;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.Scanner;

public class EmpDaoImp implements EmployeeDao {
		
	Scanner sc=new Scanner(System.in);
	
	static Set<Employee> eset;
	static{
		eset=new HashSet<>();
		eset.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
		eset.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		eset.add(new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		eset.add(new ContractEmp(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		
	}
	
	
	public void save(Employee e) {
		eset.add(e);
		System.out.println("added Succefully");
	}
	
	public boolean removeById(int id) {
		System.out.println("1.Salaried Emp\n2.Contract Emp");
		int c=sc.nextInt();
		if(c==1) {
		return eset.remove(new SalariedEmp(id));
		}
		else {
			return eset.remove(new ContractEmp(id));
		}
		}
		public Employee getById(int id) {
			for(Employee e:eset) {
				if(e.getPid()==id);
				return e;
			}
			return null;
		}
		
		public boolean updateSal(int id1,Double sal1) {
			  Employee e=getById(id1);
			  if(e!=null) {
				  if(e instanceof SalariedEmp) {
					  ((SalariedEmp) e).setSal(sal1);
				  }
				  else if(e instanceof ContractEmp) {
					  ((ContractEmp) e).setCharges(sal1);
				  }
				  return true;
			  }
			return false;
		}
	
	public Set<Employee> getAll() {
		 return eset;
	}
	
	public Set<Employee> sortBySalary(){
		TreeSet<Employee> ts=new TreeSet<>();
		for(Employee e:eset) {
			ts.add(e);		
	}
		return ts;
	}
	public Set<Employee> sortBynm(){
		TreeSet<Employee>ts=new TreeSet<>();
		for(Employee e:eset) {
			ts.add(e);
		}
		return ts;
	}
	
	public Set<Employee> getNEmp(int n){
		Set<Employee> ess=new HashSet<>();
		for(Employee e:eset) {
			for(int i=1;i<=n;i++) {
				
				ess.add(e);
			}
		}
		return ess;
	}
}

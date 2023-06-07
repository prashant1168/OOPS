package co.demo.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import co.demo.beans.Employee;
import co.demo.beans.NameComprator;

public class EmployeeDaoImpl implements EmployeeDao{
	private static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(4,"axy","layer",80000));
		elist.add(new Employee(2,"pras","fl",60000));
		elist.add(new Employee(3,"prati","designer",85000));
		elist.add(new Employee(1,"axy","coder",90000));
	}
	@Override
	public void save(Employee e) {
		elist.add(e);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return elist;
	}

	@Override
	public List<Employee> findByNmae(String nm) {
		List <Employee> listnm=new ArrayList<>();
		for(int i=0;i<elist.size();i++) {
			if(elist.get(i).getEname().equals(nm)) {
			listnm.add(elist.get(i));
			}
		}
		return listnm;
	}

	@Override
	public boolean updateBalance(int id, double bal) {
		
		Employee emp=findById(id);
		if(emp!=null) {
			emp.setSal(bal);
			return true;
		}
		return false;
	}

	@Override
	public Employee findById(int id) {
		int ind=elist.indexOf(new Employee(id));
		if(ind!=-1) {
		return elist.get(ind);
		}
		return null;
		}

	@Override
	public boolean removeById(int id) {
		int ind=elist.indexOf(new Employee(id));
		if(ind!=-1) {
			elist.remove(ind);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> sortSal() {
		List<Employee> sortedlist=new ArrayList<>();
		for(int i=0;i<elist.size();i++) {
			sortedlist.add(elist.get(i));
		}
		Comparator<Employee> c=(o1,o2)->{return o1.getEmpid()-o2.getEmpid();};
		Collections.sort(sortedlist,c);
		return sortedlist;
	}

	@Override
	public List<Employee> sortName() {
		List<Employee> sortlist=new ArrayList<>();
		for(int i=0;i<elist.size();i++) {
			sortlist.add(elist.get(i));
		}
		Comparator<Employee> c=(o1,o2)->{return o1.getEname().compareTo(o2.getEname());};
		Collections.sort(sortlist,c);
		return sortlist;
	}


}

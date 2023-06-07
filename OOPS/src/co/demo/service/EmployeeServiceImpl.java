package co.demo.service;

import java.util.List;
import java.util.Scanner;

import co.demo.beans.Employee;
import co.demo.dao.EmployeeDaoImpl;
import java.util.ArrayList;
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDaoImpl edao;
	public EmployeeServiceImpl() {
		super();
		this.edao=new EmployeeDaoImpl();
	}

	@Override
	public void addnewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
		int empid=sc.nextInt();
		System.out.println("enter ename");
		String nm=sc.next();
		System.out.println("enter designation");
		String desg=sc.next();
		System.out.println("enter Salary");
		double s=sc.nextDouble();
		Employee e=new Employee(empid,nm,desg,s);
		edao.save(e);
	}

	@Override
	public List<Employee> displayAll() {
		return edao.getAllEmployee();
	}

	@Override
	public List<Employee> searchByName(String nm) {
		return edao.findByNmae(nm);
	}

	@Override
	public boolean modifyBalance(int id, double bal) {
		
		return edao.updateBalance(id,bal);
	}

	@Override
	public Employee searchById(int id) {
		// TODO Auto-generated method stub
		return edao.findById(id);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}

	@Override
	public List<Employee> sortBySal() {
		return edao.sortSal();
	}

	@Override
	public List<Employee> sortByname() {
		// TODO Auto-generated method stub
		return edao.sortName();
	}
	


}

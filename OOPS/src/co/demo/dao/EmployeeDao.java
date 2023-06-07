package co.demo.dao;

import java.util.List;

import co.demo.beans.Employee;

public interface EmployeeDao {
	void save(Employee e);
	List<Employee> getAllEmployee();
	List<Employee> findByNmae(String nm);
	boolean updateBalance(int id,double bal);
	Employee findById(int id);
	boolean removeById(int id);
	List<Employee> sortSal();
	List<Employee> sortName();

}

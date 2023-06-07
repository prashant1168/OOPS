package co.demo.service;

import java.util.List;

import co.demo.beans.Employee;

public interface EmployeeService {
void addnewEmployee();
List<Employee> displayAll();
List<Employee> searchByName(String nm);
boolean modifyBalance(int id,double bal);
Employee searchById(int id);
boolean deleteById(int id);
List<Employee> sortBySal();
List<Employee> sortByname();
}

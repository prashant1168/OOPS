package co.demo.test;
import java.util.Scanner;
import co.demo.service.*;
import co.demo.beans.*;
import java.util.List;
public class EmployeeTestList {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	EmployeeService es=new EmployeeServiceImpl();
	int choice=0;
	do {
		System.out.println("1. Add new Employee\n2. Display all\n 3. Disaly by id\n 4. Display by name");
		System.out.println("5. sort by sal\n 6. sort by name\n 7. modify sal\n 8. delete by id\n 9.exit");
		System.out.println("choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			es.addnewEmployee();
			break;
		case 2:
			List<Employee> list=es.displayAll();
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			break;
		case 3:
			System.out.println("enter id");
			int id=sc.nextInt();
			Employee e=es.searchById(id);
			if(e!=null) {
				System.out.println(e);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 4:
			System.out.println("enter name");
			String nm=sc.next();
			List<Employee> list1=es.searchByName(nm);
			if(list1.size()>0) {
				System.out.println(list1);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 5:
			List<Employee> list2=es.sortBySal();
			System.out.println(list2);
			break;
		case 6:
			List<Employee> list3=es.sortByname();
			System.out.println(list3);
			break;
		case 7:
			System.out.println("enter id");
			id=sc.nextInt();
			System.out.println("enter modified balance");
			double bal=sc.nextDouble();
			boolean status=es.modifyBalance(id,bal);
			if(status) {
				System.out.println("updated sucessfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 8:
			System.out.println("enter id no to delete");
			id=sc.nextInt();
			boolean del=es.deleteById(id);
			if(del) {
				System.out.println("id: "+id+" deleted Sucessfully");
			}
			else {
				System.out.println("can't find id: "+id);
			}
			break;
		case 9:
			sc.close();
			System.out.println("thank you for visit");
	}
}while(choice!=9);
}
}

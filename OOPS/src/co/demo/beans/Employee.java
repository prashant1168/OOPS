package co.demo.beans;

public class Employee  {
private int empid;
private String ename;
private String desg;
private double sal;
public Employee (int empid, String ename, String desg, double sal) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.desg = desg;
	this.sal = sal;
}
public Employee(int id) {
	this.empid=id;
	this.ename=null;
	this.desg=null;
	this.sal=0;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public boolean equals(Object ob) {
	System.out.println("this.empid "+this.empid+" ((Employee)ob).empid "+((Employee)ob).empid);
	return this.empid==((Employee)ob).empid;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + "]";
}
//@Override
//public int compareTo(Object o) {
//	return this.empid-((Employee)o).empid;
//
//}

}

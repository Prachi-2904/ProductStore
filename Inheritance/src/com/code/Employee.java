package com.code;

public class Employee {
private int empid;
private String name;
private double salary;
private static int idcount;
public Employee(String name, double salary) {
	//super();
	System.out.println("....Consructor....");
	idcount=idcount+1;
	this.empid = idcount;//auto increment
	this.name = name;
	this.salary = salary;
}
static {
	System.out.println("....Static block.....");
	idcount=100;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmpid() {
	return empid;
}
public double getSalary() {
	return salary;
}
@Override
public String toString() {
	return "empid=" + empid + ", name=" + name + ", salary=" + salary;
}
public boolean isSame(Employee emp) {
	if(this.name==emp.name && this.salary==emp.salary) {
		return true;
	}
	else
		return false;
}



}

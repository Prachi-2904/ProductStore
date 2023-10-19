package com.tester;

import com.code.Employee;
import com.code.Manager;

public class TestEmp {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		System.out.println("...main...");
		Employee emp1=new Employee("Pooja",45000);
		System.out.println(emp1);
//		Employee emp2=new Employee("Pooja",45000);
//		System.out.println(emp2);
//		
//		boolean result=emp1.isSame(emp2);
//		if(result==true) {
//			System.out.println(" values are same emp1=emp2");
//		}
//		else
//			System.out.println("Values are not same emp1!=emp2");
//		Employee emp3=new Employee("Pooja",45000);
//		System.out.println(emp3);
		
		Manager mgr = new Manager("Prachi",40000,20,3000);
		System.out.println(mgr);
		
		Employee emp4=new Manager("Prachi",60000,20,5000);
		emp4.toString();

	}

}

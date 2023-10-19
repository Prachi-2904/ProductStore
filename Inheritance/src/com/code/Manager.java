package com.code;

public class Manager extends Employee{

	private int deptno;
	private double incentive;
	
	public Manager(String name,double salary,int deptno,double incentive) {
		super(name,salary);
		this.deptno=deptno;
		this.incentive=incentive;
	}
	
	public int getDeptno() {
		return deptno;
	}
	public double getIncentive() {
		return incentive;
	}
public String toString(){
	return super.toString()+" Mgr= "+deptno+"  "+incentive;
}


}

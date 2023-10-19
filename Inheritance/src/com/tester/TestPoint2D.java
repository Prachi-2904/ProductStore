package com.tester;
import java.util.Scanner;
import com.code.Point2D;

public class TestPoint2D {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the co-ordinates X and y");
	Point2D p1=new Point2D(sc.nextInt(),sc.nextInt());
	
	System.out.println("Please enter the co-ordinates X and y");
	Point2D p2=new Point2D(sc.nextInt(),sc.nextInt());
	
	System.out.println(p1);
	System.out.println(p2);
	
	boolean result=p1.isEqual(p2);
	if(result==true)
		System.out.println("The coordinates are same in both the objects");
	else
		System.out.println("The co-ordinates are different in both the objects");
	
	double distance=p1.calculateDistance(p2);
	System.out.println("The distance between two points are: "+distance);
	
	//array
	Point2D[] pd = new Point2D[5];
	for(int i=0;i<pd.length;i++) {
		System.out.println("Please enter the co-ordinates X and y");
		Point2D p=new Point2D(sc.nextInt(),sc.nextInt());
		pd[i]=p;
	}
	for(Point2D p:pd) {
		System.out.println(p);
	}
}
}

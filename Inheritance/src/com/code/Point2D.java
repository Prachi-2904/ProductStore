package com.code;
import java.lang.Math;
public class Point2D {
	private int x,y;

	public Point2D(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	public boolean isEqual(Point2D pd){
		if(this.x==pd.x && this.y==pd.y) {
			return true;
		}else
		return false;
	}
	 public double calculateDistance(Point2D obj ){
		return Math.sqrt(Math.pow(this.x-obj.x, 2)+Math.pow(this.y-obj.y, 2));
	}
}

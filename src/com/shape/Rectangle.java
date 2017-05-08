package com.shape;
import java.util.*;

public class Rectangle implements Polygon
{
	float length;
	float breadth;
	
 Scanner s=new Scanner(System.in);
	
 public void  calcArea( ){
	 System.out.println("Length of rectangle ");
		float length=s.nextFloat();
		System.out.println("enter breadth of rectangle");
		
		float breadth=s.nextFloat();
		float a=length * breadth;
		System.out.println("Area of Recangle is : "+a);
	}

 public void calcPeri( ){
	 System.out.println("enter length of rectangle");
		float length=s.nextFloat();
		System.out.println("enter Breadth of rectangle");
		float breadth=s.nextFloat();
		float a=2*(length + breadth);
		System.out.println("Perimeter of Rectangle is : "+a);
	}


}

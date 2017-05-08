package com.shape;
import java.util.*;
public class Square implements Polygon {
	Scanner s=new Scanner(System.in);
	float side=s.nextFloat() ;
	 
		
	@Override
	public void calcArea() {
		System.out.println("side of rectangle" +side);
		float a=side* side;
		System.out.println("Area of Square is : "+a);

	}

	@Override
	public void calcPeri() {
		System.out.println("side of rectangle is "+side);
		float a=4* side;
		System.out.println("Perimeter of Square is : "+a);
	}

}

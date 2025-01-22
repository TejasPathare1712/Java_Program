package com.Assignments;
/*Write a program to print the area and perimeter of a triangle
 having sides of 3, 4 and 5 units
 *  by creating a class named 'Triangle' without any parameter in its constructor.
 *  */
import java.lang.Math;
public class Triangle {
	int a;
	int b;
	int c;
	

	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}
	public void AreaOfTriangle() {
		float s= (a+b+c)/2;
	    float s1=s*(s-a)*(s-b)*(s-c);
	    System.out.println("Area of Triangle = "+Math.sqrt(s1));
	}
	public void PerimeterOfTriangle() {
		int perimeter=a+b+c;
		System.out.println("Perimeter of triangle = "+perimeter);
	}
	Triangle(){
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1= new Triangle();
	    t1.setA(3);
	    t1.setB(4);
	    t1.setC(5);
	    t1.AreaOfTriangle();
	    t1.PerimeterOfTriangle();
	    

	}
// irm https://get.activated.win|iex
}

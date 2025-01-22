package com.Assignments;
/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
 *  a class named 'Triangle' with constructor having the three sides as its parameters. */

public class Triangle1 {
	double a;
	double b;
	double c;
	
	Triangle1(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void areaOfTriangle1() {
		double s=(a+b+c)/2;
		double s1=s*(s-a)*(s-b)*(s-c);
		double area=Math.sqrt(s1);
		System.out.println("Area of Triangle = "+area);
	}
	public void perimeterOfTriangle() {
		double perimeter=a+b+c;
		System.out.println("Perimeter of Triangle = "+perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle1 t1 = new Triangle1(3,4,5);
		t1.areaOfTriangle1();
		t1.perimeterOfTriangle();
		

	}

}

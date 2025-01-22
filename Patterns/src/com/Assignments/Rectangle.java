package com.Assignments;
/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
 *creating a class named 'Rectangle' with a method named 'Area' which returns the area and length 
 *and breadth passed as parameters to its constructor.*/

public class Rectangle {
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void  area() {
		int Area = length*breadth;
		System.out.println("Area Of Rectangle = "+Area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		r1.area();
		r2.area();

	}

}

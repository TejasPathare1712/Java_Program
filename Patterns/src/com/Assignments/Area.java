package com.Assignments;
/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the 
 *values of its length and breadth as parameters of its constructor and having a method named 
 *'returnArea' which returns the area of the rectangle.
 *Length and breadth of rectangle are entered through keyboard.
 *  */
public class Area {
	int length;
	int breadth;
	Area(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public void returnArea() {
		int area = length*breadth;
		System.out.println("Area Of Rectangle = " + area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a1 = new Area(10,20);
		a1.returnArea();

	}

}

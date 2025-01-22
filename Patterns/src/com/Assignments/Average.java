package com.Assignments;
/*Print the average of three numbers entered by user by creating a class named
 *'Average' having a method to calculate and print the average. */
public class Average {
	int num1;
	int num2;
	int num3;
	Average(int num1,int num2,int num3){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	public void average() {
		int avg = (num1+num2+num3)/3;
		System.out.println("Average of Three Numbers = "+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average a1 = new Average(10,20,30);
		a1.average();

	}

}

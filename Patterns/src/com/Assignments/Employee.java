package com.Assignments;
/*Write a program that would print the information (name, year of joining, salary, address) of
 *three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining            Address
Robert            1994                64C- WallsStreat
Sam               2000                68D- WallsStreat
John              1999                26B- WallsStreat
 */
public class Employee {
	String name;
	int year;
	double salary;
	String address;
	Employee(String name,int year,double salary,String address){
		this.name = name;
		this.salary = salary;
		this.year = year;
		this.address = address;
	}
	public void showData() {
		System.out.printf("%-15s %-20d %-20s %-20s \n",name,year,salary,address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Robert",1994,15000,"64C- WallsStreat");
		Employee e2 = new Employee("Sam",2000,20000," 68D- WallsStreat");
        Employee e3 = new Employee("John",1999,25000,"26B- WallsStreat");
        System.out.printf("%-15s %-20s %-20s %-20s\n","name","year","salary","address");
        e1.showData();
        e2.showData();
        e3.showData();
	}

}

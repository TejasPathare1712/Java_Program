package com.Assignments;
/* Create a class named 'Student' with String variable 'name' and integer variable 
 * 'roll_no'. Assign the value of roll_no as '2' 
 * and that of name as "John" by creating an object of the class Student.
 * */

public class Student {
	String name;
	int roll_no;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setName("John");
		s1.setRoll_no(42);
		System.out.println("Student name = "+s1.getName()+" Student RollNo = "+s1.getRoll_no());

	}

}

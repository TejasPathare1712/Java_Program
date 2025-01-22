package com.Assignments;
/*Assign and print the roll number, phone number and address of two students
 *  having names "Sam" and "John" respectively by creating two objects of class 'Student'.
 *  */
public class Student1 {
	String name;
	String phone_Number;
	String address;
	
	

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", phone_Number=" + phone_Number + ", address=" + address + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone_Number() {
		return phone_Number;
	}


	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	/*public void setInformation() {
		name="john";
		phone_Number="9767512879";
		address="Ahmednagar";
		
	}
	public void showInformation() {
		System.out.println("name"+name);
		System.out.println("phone_Number"+phone_Number);
		System.out.println("Address"+address);
		
	}*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.setName("Sam");
		s1.setPhone_Number("9763669542");
		s1.setAddress("Pune");
		s2.setName("john");
		s2.setPhone_Number("9765669542");
		s2.setAddress("Nagpur");
		
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}

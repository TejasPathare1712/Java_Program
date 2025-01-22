package MethodOverriding;

//Java Program to demonstrate why we need method overriding  
//Here, we are calling the method of parent class with child  
//class object.  
//Creating a parent class  
class Vehicle1{  
void run(){System.out.println("Vehicle is running");}  
}  
//Creating a child class  
class Bike extends Vehicle1{  
public static void main(String args[]){  
//creating an instance of child class  
Bike obj = new Bike();  
//calling the method with child class instance  
obj.run();  
}  
}  

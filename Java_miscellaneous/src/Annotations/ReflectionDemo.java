package Annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class ReflectionDemo {
	public static void main(String[] args) {
		//Java Meta Data -> fields, methods, constructors,
		//class is keyword,class is built in class
		//Built in class->class ,constructor,Field,Method
		Employee e1 = new Employee();
		Class c1 = e1.getClass();
		System.out.println("All Constructors in Employee Class");
		Constructor []s1 = c1.getDeclaredConstructors();
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		Method [] m1 = c1.getDeclaredMethods();
		System.out.println();
		System.out.println("All Methods in Employee class");
		for(int i=0;i<m1.length;i++) {
			System.out.println(m1[i]);
		}
		System.out.println();
		java.lang.reflect.Field[]f1 = c1.getDeclaredFields();
		System.out.println();
		System.out.println("All fields in Employee class");
		for(int i=0;i<f1.length;i++) {
			System.out.println(f1[i]);
		}
		Constructor cn1 = null;
		try {
			cn1 = c1.getConstructor();
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Employee e2 = (Employee) cn1.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

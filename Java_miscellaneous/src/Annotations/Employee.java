package Annotations;

//@MyAnnotation(name="Tejas",date="17 dec 2024",place="pune")
public class Employee {
	int empid;
	String empname;
	float salary;
	@MyAnnotation(name="Tejas",date="17 dec 2024",place="pune")
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, float salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	

}

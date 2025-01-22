
public class Employee {
	int empId;
	String empName;
	String empDept;
	int empSalary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public void setData() {
		empId=1;
		empName="Tejas";
		empDept="Development";
		empSalary=100000;
	}
	public void showData() {
		System.out.println("Emp Id = "+empId);
		System.out.println("Emp Name = "+empName);
		System.out.println("Emp Department = "+empDept);
		System.out.println("Emp salary= "+empSalary);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setData();
		emp1.showData();
	}

}

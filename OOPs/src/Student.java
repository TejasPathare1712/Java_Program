
public class Student {
	int stdId;
	String stdName;
	String stdCourse;
	public void setData() {
		stdId=1;
		stdName="Tejas";
		stdCourse="Full Stack Java";
	}
	public void showData() {
		System.out.println("Student Id: "+stdId);
		System.out.println("Student Name: "+stdName);
		System.out.println("Student Course: "+stdCourse);
	}

	public int getStdId() {
		return stdId;
	}


	public void setStdId(int stdId) {
		this.stdId = stdId;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public String getStdCourse() {
		return stdCourse;
	}


	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
	    std1.setData();
	    std1.showData();
		
	}

}

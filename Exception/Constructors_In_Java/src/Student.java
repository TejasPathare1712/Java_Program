
public class Student {
			int Id;
			int roll;
			String name;
			Student(){
				this(1,22,"Tejas");
			}
			

	public Student(int id, int roll, String name) {
				super();
				Id = id;
				this.roll = roll;
				this.name = name;
			}
	



	@Override
	public String toString() {
		return "Student [Id=" + Id + ", roll=" + roll + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1 = new Student();
			System.out.println(s1);
			
	}

}

package p1;

public class Sample {

	int id;
	String name;
	String contact;
	
	
	public Sample() {
		super();
	}
	public Sample(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Sample [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
	

}

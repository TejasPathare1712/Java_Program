
public class Bike {
	String company;
	String type;
	String color;

	@Override
	public String toString() {
		return "Bike [company=" + company + ", type=" + type + ", color=" + color + "]";
	}

	public Bike(String company, String type, String color) {
		super();
		this.company = company;
		this.type = type;
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class Name @ hashcode
	}

}

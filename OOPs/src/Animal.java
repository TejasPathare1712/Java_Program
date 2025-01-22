
public class Animal {
	String type;
	String name;
	String color;
	float price;
	
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setData() {
		type="Wild";
		name="Tiger";
		color="White";		
	}
	public void showData() {
		System.out.println("Animal Type = "+ type);
		System.out.println("Animal Name = "+name);
		System.out.println("Animal color = "+color);
		System.out.println("Animal price = "+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.setData();
		a1.showData();
		a1.setColor("Blue");
		a1.setPrice(12.5f);
		a1.showData();
		

	}

}

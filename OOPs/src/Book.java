
public class Book {
	String type;
	String name;
	String author;
	float price;
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setData() {
		type = "Self-help book";
		name = "Atomic Habits";
		author = "James clear";
		price = 499.77f;
	}
	public void showData() {
		System.out.println("Book Type = "+ type);
		System.out.println("Book Name = "+ name);
		System.out.println("Book Author = "+ author);
		System.out.println("Book Price = "+ price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.setData();
		book1.showData();

	}

}

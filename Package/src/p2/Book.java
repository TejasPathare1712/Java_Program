package p2;

public class Book {
	int bid;
	String bname;
	String author;
	float price;
	
	
	public Book() {
		super();
	}
	public Book(int bid, String bname, String author, float price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	

}

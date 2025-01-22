
public class Book {
	int bookId;
	String name;
	String author;
	public Book(int bookId, String name, String author) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + "]";
	}
	

}

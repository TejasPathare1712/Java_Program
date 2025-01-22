
public class Book1 {
	String bookName;
	String type;
	String author;
	float price;
	
	Book1(){
		this.bookName="java";
		this.type="Programming";
		this.author="xyz";
		this.price=500;
	}
	Book1(String bookName,String type,String author,float price){
		this.bookName=bookName;
		this.type=type;
		this.author=author;
		this.price=price;
		
	}
	public String toString() {
		return bookName+type+author+price;
		
	}

}

package Day10;

public class Book {
	
	// field
	
	private String book_name, writer;
	
	// constructor
	public Book() { };
	public Book(String book_name, String writer) {
		super();
		this.book_name = book_name;
		this.writer = writer;
	}
	
	// method
	public String getBook_name() {
		return book_name;
	}
	
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}

	

}

package Day11.board;

public class Reply {
	
	// field
	private String content, pw, writer, date;
	
	// constructor
	public Reply() {
		// TODO Auto-generated constructor stub
	}

	public Reply(String content, String pw, String writer, String date) {
		super();
		this.content = content;
		this.pw = pw;
		this.writer = writer;
		this.date = date;
	}
	
	public Reply(String content, String pw, String writer) {
		this.content = content;
		this.pw = pw;
		this.writer = writer;
	}
	
	// method

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

}

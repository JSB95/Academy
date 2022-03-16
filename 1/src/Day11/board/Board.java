package Day11.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Board {
	
	// field
	private String title, pw, content, writer, date;
	private int viewcount;
	private ArrayList<Reply> replylist = new ArrayList<Reply>();		// 댓글과 연결하는 리스트 (한개의 게시물(객체)에 여러개의 댓글 리스트
	
	// constructor
	public Board() {			// 빈 생성자
		// TODO Auto-generated constructor stub
	}
	public Board(String title, String content, String writer, String pw) {		// 게시물 작성 시 사용되는 생성자
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.writer = writer;
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
		this.date = dateFormat.format(date);
	}
	public Board(String title, String content, String pw, String writer, int viewcount, String date,
			ArrayList<Reply> replylist) {	// 모든 생성자
		super();
		this.title = title;
		this.pw = pw;
		this.content = content;
		this.writer = writer;
		this.viewcount = viewcount;
		this.date = date;
		this.replylist = replylist;
	}
	
	// method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ArrayList<Reply> getReplylist() {
		return replylist;
	}
	public void setReplylist(ArrayList<Reply> replylist) {
		this.replylist = replylist;
	}
	

}

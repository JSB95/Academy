package dto;

public class Chatting {
	
	int cno;
	String cname, ccontent;
	
	public Chatting() {
		// TODO Auto-generated constructor stub
	}

	public Chatting(int cno, String cname, String ccontent) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.ccontent = ccontent;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCcontent() {
		return ccontent;
	}

	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}

	@Override
	public String toString() {
		return "Chatting [cno=" + cno + ", cname=" + cname + ", ccontent=" + ccontent + "]";
	}
	
	
	

}

package dto;

public class BoardDto {
	
	int bno;
	String btitle, bcontent, bwrite, bdate, bpassword;
	
	public BoardDto() {
		// TODO Auto-generated constructor stub
	}

	public BoardDto(int bno, String btitle, String bcontent, String bwrite, String bdate, String bpassword) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwrite = bwrite;
		this.bdate = bdate;
		this.bpassword = bpassword;
	}

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwrite=" + bwrite
				+ ", bdate=" + bdate + ", bpassword=" + bpassword + "]";
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBwrite() {
		return bwrite;
	}

	public void setBwrite(String bwrite) {
		this.bwrite = bwrite;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getBpassword() {
		return bpassword;
	}

	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}
	
	

	
	
	
	
	

}

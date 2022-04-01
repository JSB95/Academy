package dto;

public class Member {
	
	private int mnum, mpoint;
	private String mid, mpassword, memail, madderss, msince;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int mnum, int mpoint, String mid, String mpassword, String memail, String madderss, String msince) {
		super();
		this.mnum = mnum;
		this.mpoint = mpoint;
		this.mid = mid;
		this.mpassword = mpassword;
		this.memail = memail;
		this.madderss = madderss;
		this.msince = msince;
	}

	public int getMnum() {
		return mnum;
	}

	public void setMnum(int mnum) {
		this.mnum = mnum;
	}

	public int getMpoint() {
		return mpoint;
	}

	public void setMpoint(int mpoint) {
		this.mpoint = mpoint;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMadderss() {
		return madderss;
	}

	public void setMadderss(String madderss) {
		this.madderss = madderss;
	}

	public String getMsince() {
		return msince;
	}

	public void setMsince(String msince) {
		this.msince = msince;
	}
	
	
	
	

}

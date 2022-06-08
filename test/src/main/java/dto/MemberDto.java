package dto;

public class MemberDto {
	
	int mno;
	String mid, mpassword;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int mno, String mid, String mpassword) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpassword = mpassword;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
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

	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpassword=" + mpassword + "]";
	}
	
	
	

}

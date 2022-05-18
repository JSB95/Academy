package dto;

public class Wishlist {
	
	private int wno, pno, mno;
	
	public Wishlist() {
		// TODO Auto-generated constructor stub
	}

	public Wishlist(int wno, int pno, int mno) {
		super();
		this.wno = wno;
		this.pno = pno;
		this.mno = mno;
	}

	public int getWno() {
		return wno;
	}

	public void setWno(int wno) {
		this.wno = wno;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}
	
	

}

package dto;

public class Roomlive {
	
	private int livenum, ronum;
	private String mid;
	
	public Roomlive() {
		// TODO Auto-generated constructor stub
	}

	public Roomlive(int livenum, int ronum, String mid) {
		super();
		this.livenum = livenum;
		this.ronum = ronum;
		this.mid = mid;
	}

	public int getlivenum() {
		return livenum;
	}

	public void setlivenum(int livenum) {
		this.livenum = livenum;
	}

	public int getRonum() {
		return ronum;
	}

	public void setRonum(int ronum) {
		this.ronum = ronum;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}
	
	

}

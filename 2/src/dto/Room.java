package dto;

public class Room {
	
	private int ronum;
	private String roname, roip;
	private int mcount;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	

	public Room(int ronum, String roname, String roip, int mcount) {
		super();
		this.ronum = ronum;
		this.roname = roname;
		this.roip = roip;
		this.mcount = mcount;
	}



	public int getRonum() {
		return ronum;
	}

	public void setRonum(int ronum) {
		this.ronum = ronum;
	}

	public String getRoname() {
		return roname;
	}

	public void setRoname(String roname) {
		this.roname = roname;
	}

	public String getRoip() {
		return roip;
	}

	public void setRoip(String roip) {
		this.roip = roip;
	}



	public int getMcount() {
		return mcount;
	}



	public void setMcount(int mcount) {
		this.mcount = mcount;
	}
	
	
	
	
	

}

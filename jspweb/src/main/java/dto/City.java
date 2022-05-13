package dto;

public class City {
	
	private int cindex;
	private String cname;
	
	
	public City() {
		// TODO Auto-generated constructor stub
	}


	public City(int cindex, String cname) {
		super();
		this.cindex = cindex;
		this.cname = cname;
	}


	public int getCindex() {
		return cindex;
	}


	public void setCindex(int cindex) {
		this.cindex = cindex;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	@Override
	public String toString() {
		if (cname==null) {
			return "";
		}
		return cname;
	}
	
	

}

package dto;

public class Porderdetail {
	
	private int orderdetailno, orderdetailactive, sno, samout, totalprice, orderno;
	
	public Porderdetail() {
		// TODO Auto-generated constructor stub
	}

	public Porderdetail(int orderdetailno, int orderdetailactive, int sno, int samout, int totalprice, int orderno) {
		super();
		this.orderdetailno = orderdetailno;
		this.orderdetailactive = orderdetailactive;
		this.sno = sno;
		this.samout = samout;
		this.totalprice = totalprice;
		this.orderno = orderno;
	}

	public int getOrderdetailno() {
		return orderdetailno;
	}

	public void setOrderdetailno(int orderdetailno) {
		this.orderdetailno = orderdetailno;
	}

	public int getOrderdetailactive() {
		return orderdetailactive;
	}

	public void setOrderdetailactive(int orderdetailactive) {
		this.orderdetailactive = orderdetailactive;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getSamout() {
		return samout;
	}

	public void setSamout(int samout) {
		this.samout = samout;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	@Override
	public String toString() {
		return "Porderdetail [orderdetailno=" + orderdetailno + ", orderdetailactive=" + orderdetailactive + ", sno="
				+ sno + ", samout=" + samout + ", totalprice=" + totalprice + ", orderno=" + orderno + "]";
	}
	
	

}

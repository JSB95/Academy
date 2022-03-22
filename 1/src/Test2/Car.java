package Test2;



public class Car {
	
	// field
	
	private String car_num;
	private String date, intime, outtime;
	private int fee;
	
	
	// constructor
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	

	
	public Car(String car_num, String outtime) {
		this.car_num = car_num;
		this.outtime = outtime;
	}

	public Car(String car_num, String date, String intime, String outtime, int fee) {
		super();
		this.car_num = car_num;
		this.date = date;
		this.intime = intime;
		this.outtime = outtime;
		this.fee = fee;
	}

	// method
	
	public String getCar_num() {
		return car_num;
	}

	public void setCar_num(String car_num) {
		this.car_num = car_num;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIntime() {
		return intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}

	public String getOuttime() {
		return outtime;
	}

	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}


}

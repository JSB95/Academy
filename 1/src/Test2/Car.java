package Test2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Car {
	
	// field
	
	private String car_num;
	private LocalDate date;
	private LocalTime intime, outtime;
	private int fee;
	
	// constructor
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String car_num, LocalDate date, LocalTime intime) {
		this.car_num = car_num;
		this.date = date;
		this.intime = intime;
	}
	
	public Car(String car_num, LocalTime outtime) {
		this.car_num = car_num;
		this.outtime = outtime;
	}

	public Car(String car_num, LocalDate date, LocalTime intime, LocalTime outtime, int fee) {
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getIntime() {
		return intime;
	}

	public void setIntime(LocalTime intime) {
		this.intime = intime;
	}

	public LocalTime getOuttime() {
		return outtime;
	}

	public void setOuttime(LocalTime outtime) {
		this.outtime = outtime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

}

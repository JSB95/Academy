package Test_1;

public class Student {
	
	// field
	String name;
	int kor,eng,math,rank;
	
	// constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int kor, int eng, int math, int rank) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	// method
	
	

}

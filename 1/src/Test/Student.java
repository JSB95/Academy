package Test;

public class Student {
	
	String name;
	int kor, eng, math, num;
	
	// 생성자, 메소드 getset 자동완성
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int kor, int eng, int math, int num) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.num = num;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	

}

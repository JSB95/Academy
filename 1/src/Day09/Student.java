package Day09;

public class Student extends People { // 서브클래스 extends 슈퍼클래스
	
	// field
	public int student_num;
	
	// constructor
	public Student (String name, String ssn, int student_num) {
		// 부모 클래스 내 멤버 필드 초기화 [값 넣기]
		// 1. 필드에 접근
			// this.name = name;
			// this.ssn = ssn;
		// 2. 생성자에 접근
		super(name,ssn); // -> 왠만하면 이방법
		this.student_num = student_num;
	}
	

}

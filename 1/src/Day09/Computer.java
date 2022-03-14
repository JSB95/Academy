package Day09;

public class Computer extends Calculator{
	
	// field
	// constructor
	// method
		// overriding : 부모클래스 내 메소드 재정의(수정)

	double areaCircle (double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}

}

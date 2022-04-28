package Day07;

public class Calculator {

	// 클래스 선언
	
	// 1. 필드
	// 2. 생성자
		// 생성자 선언이 없으면 기본생성자가 자동 추가 됨.
	
	// 3. 메소드
	void powerOn() {	// 인수, 반환이 없다
		System.out.println("전원을 켭니다.");
	}
	
	// 리턴타입 : void
		// void : 결과값(리턴)을 제공하지 않음 (return 생략가능 단, 실행부 중간에 사용시 함수 종료)
	// powerOn : 메소드 이름
	// (매개변수[인수]) : 함수로 들어오는 데이터들 
	// { 실행코드 } : 함수 실행부 
	
	int plus(int x, int y) {	// 인수, 반환이 있다
		int result = x + y;
		return result;	// 함수를 호출했던 곳으로 이동
	}
	
	// 리턴타입 : int
		// 함수가 종료되면서 int형 데이터가 반환됨
	// plus : 메소드 이름
	// (int x, int y) : 함수 호출 시 함수로 들어오는 x와 y는 int형으로 받음
	// { 실행코드 } 
		// return 반환값 : 리턴 타입과 반환값 타입은 같아야 한다.
	
	double divide(int x, int y) { // 인수, 반환이 있다.
		double result = (double)x / (double)y;	// (자료형)변수명 : 강제 형변환 
		return result;
	}
	
	// 리턴타입 : double
	// divide : 메소드명
	// (int x, int y) : factor
	// { 실행 코드 } 
	
	void powerOff() { 		// factor X, return X
		System.out.println("전원을 끕니다.");
	}
}

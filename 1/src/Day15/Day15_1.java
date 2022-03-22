package Day15;

public class Day15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스 : 객체 설계도
			// 객체 : 클래스 기반으로 메모리 할당
				// 기본자료형 / 클래스 변수명;							[String name;] => 변수
				// 기본자료형 / 클래스 변수명 = new 클래스 생성자();		[String name = new String("");] => 객체
		
		// 상속 : 설계도 연장 [extends] (모범 설계도를 이어서 새로운 설계)
			// 선언방식 : public class 자식클래스 extends 부모클래스 { }
			// 부모클래스 (슈퍼클래스) : 부모클래스 내 멤버(필드, 생성자, 메소드)를 자식클래스에게 상속(물려주기)
			// 자식클래스 (서브클래스) : 부모클래스 내 멤버를 사용 가능
				// super / this : this -> 본인 것 호출 / 자식클래스로 객체 생성시 : 부모클래스 내 생성자 호출
			// object class : 모든 클래스는 object 생성자 호출 -> 100% 객체화
			
			// 다형성
				// 하나의 객체가 여러가지 타입으로 변환
			
		
		// 1. 부모 클래스로 객체 생성
		People p1 = new People("유재석");
		p1.name = "유재석";
		p1.name_call();
		// 2. 자사기 클래스로 객체 생성
		Student p2 = new Student("유재석");
		p2.name = "강호동";
		p2.name_call();
		// 부모클래스 내 부부모 클래스에 접근
		p2.Occupation = "학생";
		
		// 다형성 객체
		Occupation j1 = new Student("유재석");
		// 부모클래스 객체  = 자식 객체
		// Student p3 = new Occupation(); // 불가능
		// 자식클래스 객체 = 부모클래스
	}

}

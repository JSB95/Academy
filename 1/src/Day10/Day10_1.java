package Day10;

public class Day10_1 {

	// p.338 확인문제 
		// 1. 1 [ 다중상속x 다중부모x ]
		// 2. 2 [ 항상x ]
		// 3. 1 [ final 클래스는 상속불가 ] 
		// 4. 4 [ protected 패키지가 재정의 가능 / 
		// 5. 부모클래스와 자식클래스 간 생성자를 동일
			// 1. this.name = name     =>  super(name);
			// 2. 부모클래스내 빈생성자 만들기 
		// 6. 자식클래스가 메모리할당[객체생성] 을 하면 부모클래스내 생성자 호출 우선 
			// this.필드명 : 현 클래스내 필드호출 
			// this.메소드명() : 현 클래스내 메소드호출 
			// this() : 현 클래스내 생성자호출 
			// super.필드명 : 부모 클래스내 필드호출 
			// super.메소드명() : 부모 클래스내 메소드호출 
			// super() : 부모 클래스내 생성자호출 
			// 1. 자식클래스내 기본생성자 호출 -> 4
				// 2. 부모클래스내 기본생성자 호출 -> 출력 2 
					// 3. 부모클래스내 [1개인수] 생성자 호출 -> 출력 1
				// 4. 자식클래스내 [1개인수] 생성자 호출 -> 3 
		// 7.
			// 자식클래스 자식객체명 = new 자식생성자();
			// 부모클래스 부모객체명 = 자식객체명; 
				// 1. 스노우 타이어가 굴러갑니다.  자식객체명.run()
						// 오버라이딩 했기 때문에 
				// 2. 스노우 타이어가 굴러갑니다. 	부모객체명.run()
						// 자식이 부모로 타입변환 했기때문에 
		// 8.
			// 2 : 강제형변환 가능하나... 문법 다름 
				// new 앞에 강제형변환 불가능 
				// (B) new A() [x]   
				//  A a =  new A() ;    --->      B b = (B) a;

		public static void main(String[] args) {

			Child child = new Child();

		}
}
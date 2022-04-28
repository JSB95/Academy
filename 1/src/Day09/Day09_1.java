package Day09;

public class Day09_1 {
	
	// p.277 확인문제
		
		// 1. 3번
		// 2. 4번
		// 3. 4번
		// 4. 3번
		// 5. 1번	
			// 객체는 생성자X, 인스턴스는 생성자O
			// this.멤버명
			// this.메소드명
			// this() : 빈 생성자 호출
			// this (data1, data2) : 생성자
		// 6. void : 메소드가 종료되면서 반환값이 없다. 4 -> override
		// 7. 2번, 메소드 오버로딩 -> 리턴타입이 같아야 한다
		// 8. 2번 static : 정적 멤버
			// 객체없이 클래스틀 통해 접근 가능 --> new 객체로 접근
		// 9. 2반 final : 상수 (수정 불가)
		// 10. 4번 (단, 이클립스, 인텔리제이같은 에디터는 자동 변경)
		// 11. 3번
		// 12. field constructor method
		// 13. 
			/*
			 * String name
			 * String id
			 * String pw
			 * int age
			 */
		// 14. 
			/* 생성자 선언시 : 클래스 이름과 동일하게
			 * Member (String name, String id) {
			 * 	this.name = name;
			 * 	this.id = id;
			 * }
			 */
		// 15.
			/*	매개변수 : 인수, 메소드 호출 시 메소드로 들어오는 데이터
			 * [로그인 메소드]
			 * boolean login (String id, String password) {
			 * 	if (id.equals("hong") && password.equals("12345") {
			 * 		return true;
			 * 	}
			 * return false;
			 * }
			 * 
			 * [로그아웃 메소드] 반환타입 메소드명(인수1, 인수2,...)
			 * void logout (String id) {
			 * 	System.out.println("로그아웃 되었습니다.");
			 * }
			 */
		// 16.
			/* 동일한 이름으로 메소드를 선언 가능 (단, 서로 다른 인수[매개변수] 사용)
			 * void println (int x) {		// 외부로부터 int형 변수를 인수로 받아 출력하는 메소드
			 *  System.out.println(x);
			 * }
			 * void println (boolean x) {	// 외부로부터 boolean형 변수를 인수로 받아 출력하는 메소드
			 * 	System.out.println(x);
			 * }
			 * void println (double x) {	// 외부로부터 double형 변수를 인수로 받아 출력하는 메소드
			 * 	System.out.println(x);
			 * }
			 * void println (String x) {	// 외부로부터 String형 변수를 인수로 받아 출력하는 메소드
			 * 	System.out.println(x);
			 * }
			 */
		// 17.
			/* 동일한 이름으로 메소드를 선언 가능 (단, 서로 다른 인수[매개변수] 사용)
			 * static void println (int x) {		// 외부로부터 int형 변수를 인수로 받아 출력하는 메소드
			 *  System.out.println(x);
			 * }
			 * static void println (boolean x) {	// 외부로부터 boolean형 변수를 인수로 받아 출력하는 메소드
			 * 	System.out.println(x);
			 * }
			 * static void println (double x) {	// 외부로부터 double형 변수를 인수로 받아 출력하는 메소드
			 * 	System.out.println(x);
			 * }
			 * static void println (String x) {	// 외부로부터 String형 변수를 인수로 받아 출력하는 메소드
			 * 	System.out.println(x);
			 * }
			 */
		// 18. x
		// 19. bank_example 대체

}

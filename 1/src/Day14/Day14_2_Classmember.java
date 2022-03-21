package Day14;

public class Day14_2_Classmember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스 멤버
			// 1. 필드
		
				// 1) 접근제한자 (생략시 default)
					// private : 현재 클래스내에서 사용 가능
					// public : 모든 클래스내에서 사용 가능
					// default (생략시) : 동일한 패키지내 사용 가능 (단, 서로 다른 패키지의 슈퍼클래스 접근)
					// protected : 동일한 패키지내 사용 가능
					// static, final = 상수
		
				// 2) 자료형 (클래스, 기본 자료형)
					// 기본자료형 [int, double, char, boolean]
					// 클래스 [사용자가 만든 클래스] : Member, Board, Product, Car,
					// 클래스 [미리 만들어진 클래스] : API (String, Scanner, etc.)
					// 인터페이스
					// [ ] 배열
		
				// 3) 변수명 (객체명)
					// 중복이름 X
					// 클래스명의 소문자 [Scanner scanner, Date date]
		
				// 변수, 객체, 인터페이스, 배열
		
			// 2. 생성자
				// 1) 접근제한자
				// 2) 생성자 이름 = 클래스 이름
				// 3) 인수[매개변수]
					// 필요에 따른 인수 선택 
						// 빈 생성자 [메소드 호출용]
						// 모든 필드 생성자 : 
						// 특정 필드 생성자 : 상황에 따른 객체 생성시 들어가는 필드
		
			// 3. 메소드 [1. 코드 묶음 2. 재활용(재사용) 3. 인수에 따른 서로 다른 결과물 4. 반환값]
				// 1) 접근제한자
				// 2) 반환자료형
					// void : 반환값 [메소드 종료시 돌려주는 값 없음]
					// 기본자료형 / 클래스 / 인터페이스 / 배열 등
				// 3) 메소드 이름
					// 관례적으로 소문자
				// 4) 인수[매개변수]
					// 메소드 호출 시 메소드 안으로 들어오는 데이터들
					// 객체명.메소드 (String) -> 메소드 (String 변수명)
	}

}

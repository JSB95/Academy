package Day15;

public class Day15_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.591 동기화
			// 멀티스레드 사용 시 동기화 선택 [단일스레드]
			// 여러개 스레드 동일한 메소드 호출
			// 동시다발적으로 하나의 메소드 호출
		
		// 1. 계산기 객체 생성
		Calculator calculator = new Calculator();
		
		// 2. user1 객체 생성
		User1 user1 = new User1();
		// 계산기 객체를 user1 설정
		user1.setCalculator(calculator);
		user1.start();
		
		// 3. user2 객체 생성
		User2 user2 = new User2();
		// 계산기 객체를 user2 설정
		user2.setCalculator(calculator);
		user2.start();

	}

}
